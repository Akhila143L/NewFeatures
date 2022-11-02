package com.infinite.newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmploy {

	public static void main(String[] args) {
		
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Swathi", 99323));
		employList.add(new Employ(2,"Madhu", 90432));
		employList.add(new Employ(3,"Areef", 89422));
		employList.add(new Employ(4,"Akhi", 80943));
		employList.add(new Employ(5,"Javed", 87744));
		employList.add(new Employ(6,"Krishna", 90833));
		employList.add(new Employ(7,"Sravani", 89032));
		
		Collections.sort(employList, (e1, e2) -> {
			return e1.getName().compareTo(e2.getName());
			
		});
		System.out.println("Sort By Name  ");
		employList.forEach(System.out::println);
        System.out.println("Sort by Basic-Wise  ");
        
		Collections.sort(employList, (e1, e2) -> {
         return (int) (e1.getBasic() - e2.getBasic());
	    });
		employList.forEach(System.out::println);
   }
}
