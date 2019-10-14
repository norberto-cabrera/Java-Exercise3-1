import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JsonRead {
	//Use properties that returns string values, this properties should call a Read Json Method 1points
	public String ReadJson (Object obj) {
		String Pasar="";
        //USe JSONObject 3points
		JSONObject jsonObject = (JSONObject) obj;
        //Use jsonObject.get(Parameter); 4points
		JSONArray AppSettings = (JSONArray) jsonObject.get("AppSettings");

		Iterator<String> Cadena = AppSettings.iterator();
		while (Cadena.hasNext()) {
			Pasar += Cadena.next() + "\n";
		}	  
		return Pasar;
	}
}
