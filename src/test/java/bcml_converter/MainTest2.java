package bcml_converter;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;



import java.io.OutputStream;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.Pipe;
import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.XmlIOUtil;
import com.google.protobuf.Message;
import com.googlecode.protobuf.format.XmlFormat;

public class MainTest2 {

	public static void main(String[] args) throws IOException{
//		BcmlToProtobufConverter testConverter = new BcmlToProtobufConverter();
//		testConverter.convert("sample.xsd", "output.proto", true);
		
//		Shiporder rt = new Shiporder();
//		InputStream xmlInputStream = new FileInputStream(new File("C:\\p\\bcml_converter\\sampleXml.xml"));
//		XmlIOUtil.mergeFrom(xmlInputStream, rt, Shiporder.getSchema());	
//		
//		System.out.println("" + rt.getShipto().getCar());	
			
	}
	
	private static String readFileAsString(String filePath) throws IOException
    {
        StringBuffer fileData = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead = 0;
        while ((numRead = reader.read(buf)) != -1)
        {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }
        reader.close();
        String m = fileData.toString();
        System.out.println(m);
        return m;
    }

}
// Create the Object from XML
//Message.Builder builder = Root.newBuilder();
//String fileContent = "";
////file3 contents same XML String as toXml
//fileContent = readFileAsString("C:\\p\\bcml_converter\\sampleXml.xml");
//// call protobuf-java-format method to generate Object
//XmlFormat.merge(fileContent, builder);
//Message msg= builder.build();
//System.out.println("From XML"+XmlFormat.printToString(msg));
//System.out.println("-Done-");	

//OutputStream out = new FileOutputStream(new File("C:\\p\\bcml_converter\\outXml.xml"));
//XmlIOUtil.writeTo(out, rt, Shiporder.getSchema());

//OutputStream out = new DataOutputStream(new FileOutputStream(new File("C:\\p\\bcml_converter\\out")));
//
//// transcode the xml encoding to protobuf encoding
//LinkedBuffer buffer = LinkedBuffer.allocate(2048);
//Pipe pipe = XmlIOUtil.newPipe(xmlInputStream);
//ProtobufIOUtil.writeTo(out, pipe, Shiporder.getPipeSchema(), buffer);
//
//InputStream in = new DataInputStream(new FileInputStream(new File("C:\\p\\bcml_converter\\out")));
