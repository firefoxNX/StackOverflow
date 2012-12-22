import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.tempuri.PackWSSoap;


public class PackageClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
            URL url = new URL("http://10.0.1.32:49232/PackWS.asmx?wsdl");
            QName qName = new QName("http://tempuri.org/", "PackWS");

            Service service = Service.create(url, qName);

            PackWSSoap packWS = service.getPort(PackWSSoap.class);

            System.out.println(packWS.getName());//null here

            packWS.addPackage(packWS.getPackage(1));//C# exception here

//            System.out.println(packWS.getPackage(getPack().getId()));//unreachable 


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

	}

}
