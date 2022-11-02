package com.infinite.newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
public static void main(String[] args) {
	List<Employ> employList = new ArrayList<Employ>();
	employList.add(new Employ(1,"Swathi", 99323));
	employList.add(new Employ(2,"Madhu", 90432));
	employList.add(new Employ(3,"Areef", 89422));
	employList.add(new Employ(4,"Akhi", 80943));
	employList.add(new Employ(5,"Javed", 87744));
	employList.add(new Employ(6,"Krishna", 90833));
	employList.add(new Employ(7,"Sravani", 89032));
	
	Stream<Employ> employFilter =  
			//employList.stream().filter(x -> x.getBasic() >=90000);
	employList.stream().filter(x -> x.getName().startsWith("A"));

	System.out.println("Filtered Data  ");
	employFilter.forEach(System.out::println);
}
}
