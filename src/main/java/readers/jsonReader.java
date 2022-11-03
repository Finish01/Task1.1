package readers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import models.Address;
import models.People;
import models.Root;

public class jsonReader {
	
	public Root parse() throws FileNotFoundException, IOException, ParseException {
		
		Object obj = new JSONParser().parse(new FileReader("./files/json/admin_users.json"));
		JSONArray arr = (JSONArray) obj;
		
		Root root = new Root();
		
		List<People> peopleList = new ArrayList();
		
		for(Object e : arr) {
			
			JSONObject elem = (JSONObject) e;
			
			long id = (Long) elem.get("id");
			String name = (String) elem.get("name"); 	
			JSONObject addressObj = (JSONObject) elem.get("address");
			
			if ((addressObj != null) && (!addressObj.isEmpty())) {
				
				List<Address> addressList = new ArrayList();
				
				String city = (String) addressObj.get("city");
				String street = (String) addressObj.get("street");
				long building = (Long) addressObj.get("building");
				
				Address address = new Address(city, street, (int) building);
				addressList.add(address);
				
				People people = new People((int)id, name, addressList);
				peopleList.add(people);
			}
			else {
				People people = new People((int)id, name);
				peopleList.add(people);
			}
			
		}
		
		root.setPeople(peopleList);
		
		return root; 
	}
	
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException{  
		
		jsonReader reader = new jsonReader();
		Root root = new Root();
		root = reader.parse();
		
		for(People person : root.getPeople()) {
			
			System.out.println(person.getId());
			System.out.println(person.getName());
			if(person.getAddress()!=null) {
				System.out.println(person.getAddress().get(0).getCity());
				System.out.println(person.getAddress().get(0).getStreet());
				System.out.println(person.getAddress().get(0).getBuilding());
			}
		}
	}
}


