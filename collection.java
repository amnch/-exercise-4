package ir.freeland.collection.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class collection {
	public static void main(String[] args) {
		
		azperson alireza = new azperson("Alireza", "afattahi", 48,"tehran,iran"); 
		azperson azadeh = new azperson("azadeh", "mnch", 28,"tehran,iran");
		azperson arefeh = new azperson("Arefeh", "mnch", 32,"tehran,iran");
		azperson pariya = new azperson("pariya", "jafari", 28,"tehran,iran");
		azperson mohadese = new azperson("mohadese", "nemati", 28,"tehran,iran");
		azperson zahra = new azperson("zahra", "kaveh", 28,"tehran,iran");
		azperson sadra = new azperson("sadra", "kaveh", 18,"tehran,iran");
		azperson mona = new azperson("mona", "nikzad", 28,"tehran,iran");
		azperson lia = new azperson("lia", "sharif", 1,"tehran,iran");
		azperson avina = new azperson("avina", "mnch", 8,"tehran,iran");
		
		List <azperson> azpersons = new ArrayList();		
		azpersons.add(alireza);
		azpersons.add(azadeh);
		azpersons.add(arefeh);
		azpersons.add(pariya);
		azpersons.add(mohadese);
		azpersons.add(zahra);
		azpersons.add(sadra);
		azpersons.add(mona);
		azpersons.add(lia);
		azpersons.add(avina);
		
		Collections.sort(azpersons);
		for (azperson azperson : azpersons) {
			int count = 0;
			if ( count <= 5) {
				break;
			}
			if (azperson.getAge() > 18) {
					count++;
					String foundPerson = azperson.getName();
					System.out.println("The '" + foundPerson + "' has the > 18");
			}
		}
		for (azperson azperson : azpersons) {
			int count = 0;
			if ( count <= 5) {
				break;
			}
			if (azperson.getAge() < 18) {
					count++;
					String foundPerson = azperson.getName();
					System.out.println("The '" + foundPerson + "' has the age < 18");
			}
		}
		Map<String, List<azperson>> groupAddress = 
				azpersons.stream().collect(  Collectors.groupingBy(azperson::getAddress));
		System.out.println(groupAddress);
	}
	}

