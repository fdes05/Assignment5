package com.coderscampus.arraylist;

import java.util.stream.*;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;

public class ListApplication {

	public static void main(String[] args) {
		CustomList<String> names = new CustomArrayList<>();
		
		List<String> nameList = new ArrayList<>();
		
		nameList.add("Gaetan Haas");
		nameList.add("Mark Scheifele");
		nameList.add("Sidney Crosby");
		nameList.add("Connor McDavid");
		nameList.add("Roman Josi");
		nameList.add("Mitch Marner");
		nameList.add("Max Domi");
		nameList.add("Brady Tkachuk");
		nameList.add("Elias Pettersson");
		nameList.add("Mathew Tkatchuk");
		nameList.add("David Rittich");
		nameList.add("Shea Weber");
		nameList.add("Auston Mathews");
		nameList.add("Patrick Laine");
		nameList.add("Marc Giordano");
		nameList.add("Leon Draisaitl");
		nameList.add("Quinn Hughes");
		nameList.add("Ryan Poehling");
		nameList.add("Pierre Engvall");
		nameList.add("Thomas Chabot");
		nameList.add("Connor Hellebuyck");
		nameList.add("Sam Benett");
		nameList.add("Darnell Nurse");
		
		
		for  (String name : nameList) {
			boolean success = names.add(name);
			if (success == true) {
				System.out.println("The " + name + " name was successfully added!");
			}
		}
		
		System.out.println("---------readout of CustomArrayList----------");
		for (int i = 0; i < names.getSize(); i++) {
			String name = names.get(i);
			System.out.println("Name at index " + i + ": " + name);
		}
		
	}

}
