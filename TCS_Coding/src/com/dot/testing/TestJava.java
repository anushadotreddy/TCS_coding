package com.dot.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TestJava {
	
	public static void main(String[] args) {
		System.out.println("hello");
		List<String> myList = Arrays.asList("a1", "b", "c");
		myList.stream().filter(s-> s.contains("1")).forEach(System.out::println);
		
		Map<Integer, List> id1 = new HashMap<Integer,List>();

		List<String> list1 = new ArrayList<String>();

	    list1.add("r1");
	    list1.add("r4");

	    List<String> list2 = new ArrayList<String>();
	    list2.add("r2");
	    list2.add("r5");

	    List<String> list3 = new ArrayList<String>();
	    list3.add("r3");
	    list3.add("r6");

	    id1.put(1,list1);
	    id1.put(2,list2);
	    id1.put(3,list3);
	    id1.put(10,list2);
	    id1.put(15,list3);
	    
	    Optional<List> o = id1.entrySet().stream().filter(s-> s.getKey() == Integer.valueOf(1)).map(Map.Entry::getValue).findFirst();
	    o.get().forEach(System.out::println);
	    
	    
	}
}
