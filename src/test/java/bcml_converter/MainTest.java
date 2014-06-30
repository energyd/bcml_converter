package bcml_converter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;




import bcml_converter.Output.Shiporder;

import com.dyuproject.protostuff.XmlIOUtil;
import com.google.protobuf.Message;

public class MainTest {

	public static void main(String[] args) throws IOException{
//		BcmlToProtobufConverter testConverter = new BcmlToProtobufConverter();
//		testConverter.convert("sample.xsd", "output.proto", true);

		Shiporder.Builder so = Shiporder.newBuilder();
		InputStream xmlInputStream = new FileInputStream(new File("C:\\p\\bcml_converter\\sampleXml.xml"));
		XmlIOUtil.mergeFrom(xmlInputStream, so, SchemaOutput.Shiporder.MERGE);	
		
		Shiporder ship = so.build();
		
		System.out.println("" + ship.getShipto().getCar());
		System.out.println("" + ship.getItem(1).getTitle());
		System.out.println("" + ship.getItem(1).getNote());
		System.out.println("" + ship.getItem(1).getPrice());
	}

}
