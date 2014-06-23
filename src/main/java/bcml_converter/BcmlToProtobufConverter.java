package bcml_converter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.util.TreeMap;

//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;

import com.github.tranchis.xsd2thrift.XSDParser;
import com.github.tranchis.xsd2thrift.marshal.IMarshaller;
import com.github.tranchis.xsd2thrift.marshal.ProtobufMarshaller;

public class BcmlToProtobufConverter {
	
	private XSDParser xp;
	private IMarshaller	im;
	
	/**
	 * @param xsd Specify the path to the incoming xsd file
	 * @param proto Specify the path to the output proto
	 * @param nestEnums Specify if the xsd contains nested enum
	 */
	public void convert(String xsd, String proto, boolean nestEnums) {
		 
		 xp = new XSDParser(xsd);
		 im = new ProtobufMarshaller();
		 xp.addMarshaller(im);
		 xp.setNestEnums(nestEnums);
		 
		 try {
			xp.setOutputStream(new FileOutputStream(new File(proto)));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		 //parse the xsd into a proto
		 try {
			xp.parse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}	
}
