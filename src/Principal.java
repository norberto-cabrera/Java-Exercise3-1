import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.parser.JSONParser;

public class Principal {

	public static void main(String[] args) {
		//Use JSONParser(); 2points
		JSONParser parser = new JSONParser();
		JsonRead JR = new JsonRead();

		try
		{
			Object obj = parser.parse(new FileReader("C:\\Users\\norberto.cabrera\\eclipse-workspace\\Exercise3-11\\File\\otro.txt"));
			//Use properties that returns string values, this properties should call a Read Json Method 1points
			String Cadena = JR.ReadJson(obj);
			//Print in Main the properties returning the expected value 5points
			System.out.println(Cadena);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
