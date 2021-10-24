package structural.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeEverydayExample {

	public static void main(String[] args) {
		
		Map<String,String> personAtributes = new HashMap<>();
		
		personAtributes.put("site_role", "person");
		personAtributes.put("access_role", "limited");
		
		
		Map<String,String> groupAtributes = new HashMap<>();
		
		groupAtributes.put("group_role", "claims");
		
		Map<String,String> securityAtributes = new HashMap<>();
		
		securityAtributes.putAll(personAtributes);
		securityAtributes.putAll(groupAtributes);
		
		System.out.println(securityAtributes);

	}

}
