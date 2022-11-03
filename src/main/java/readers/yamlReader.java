package readers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import models.People;
import models.Root;

public class yamlReader {

	public void parser() throws FileNotFoundException {
		
		Yaml yaml = new Yaml();
		InputStream inputStream = new FileInputStream(new File("./files/yaml/admin_users.yaml"));
		List<HashMap> list = yaml.load(inputStream);

		for(HashMap<Integer, String> e : list) {
			
//			People people = new People(  0, e.get("name"));
//			System.out.println("Name is " + people.getId());
//			System.out.println("Name is " + people.getName());
			System.out.println(e.ge);
		}
			
	}
	
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException{
		yamlReader reader = new yamlReader();
		reader.parser();
	}
}


