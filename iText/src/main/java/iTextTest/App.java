package iTextTest;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfAnnotation;
import com.itextpdf.text.pdf.PdfAppearance;
import com.itextpdf.text.pdf.PdfFormField;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;


/**
 * Hello world!
 */
public class App {

    /** A font that will be used in our PDF. */
//    public static final Font BOLD_UNDERLINED =
//            new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD | Font.UNDERLINE);

    public static void main(String[] args) throws IOException, DocumentException {
        new App().createPdf("HelloWorld.pdf");
    }

    public void createPdf(String filename)
            throws DocumentException, IOException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        document.open();

        // step 4
        Chunk sigUnderline = new Chunk("                                            ");
        sigUnderline.setUnderline(0.1f, -2f);
        Chunk dateUnderline = new Chunk("                       ");
        dateUnderline.setUnderline(0.1f, -2f);

        Paragraph para = new Paragraph("Authorized Signature: ");

        para.add(sigUnderline);
        para.add(new Chunk(" Date: "));
        para.add(dateUnderline);

        document.add(para);

        //document.add(new Paragraph("Authorized Signature: " + sigUnderline + "    Date: " + dateUnderline));

//        document.add(new Paragraph("Authorized Signature: "));
//        Font myContentStyle = new Font(); /* Define a new Font Object */
//        myContentStyle.setStyle("underline");
//        document.add(new Chunk("                                             ",myContentStyle));

        document.add(new Paragraph("Hello World!"));

//        PdfFormField field = PdfFormField.createSignature(writer);
//        field.setWidget(new Rectangle(72, 732, 144, 780), PdfAnnotation.HIGHLIGHT_INVERT);
//        field.setFieldName("mySig");
//        field.setFlags(PdfAnnotation.FLAGS_PRINT);
//        field.setPage();
//        field.setMKBorderColor(BaseColor.BLACK);
//        field.setMKBackgroundColor(BaseColor.WHITE);
//        PdfAppearance tp = PdfAppearance.createAppearance(writer, 72, 48);
//        tp.rectangle(0.5f, 0.5f, 71.5f, 47.5f);
//        tp.stroke();
//        field.setAppearance(PdfAnnotation.APPEARANCE_NORMAL, tp);
//        writer.addAnnotation(field);
        // step 5
        document.close();
    }
}
