package com.vineetb.so.poiTest;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        InputStream inp = new FileInputStream("./POITest/Test.xlsx");

        Workbook wb = WorkbookFactory.create(inp);
        Sheet sheet = wb.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        if (DateUtil.isCellDateFormatted(cell)) {
            System.out.println(cell.getDateCellValue());
        } else {
            System.out.println(cell.getNumericCellValue());
        }
        inp.close();
    }
}
