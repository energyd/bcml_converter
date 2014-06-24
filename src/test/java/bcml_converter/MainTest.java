package bcml_converter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import bcml_converter.Output.Root;

import com.google.protobuf.Message;
import com.googlecode.protobuf.format.XmlFormat;

public class MainTest {

	public static void main(String[] args) throws IOException{
//		BcmlToProtobufConverter testConverter = new BcmlToProtobufConverter();
//		testConverter.convert("sample.xsd", "output.proto", false);
		// Create the Object from XML
        Message.Builder builder = Root.newBuilder();
        String fileContent = "";
//      file3 contents same XML String as toXml
        fileContent = readFileAsString("C:\\p\\bcml_converter\\sampleXml.xml");
        // call protobuf-java-format method to generate Object
        XmlFormat.merge(fileContent, builder);
        Message msg= builder.build();
        System.out.println("From XML"+XmlFormat.printToString(msg));
        System.out.println("-Done-");
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
