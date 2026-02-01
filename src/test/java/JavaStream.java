package test.java;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.Test;

public class JavaStream {
	
	@Test
	public void regular() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Abhishek");
	names.add("Ankur");
	names.add("Pandey");
	names.add("Abhijeet");
	names.add("Mahesh");
	names.add("Sarvesh");
	
	//names start with alphabet A
	int count=0;
	for(int i=0; i<names.size(); i++) {
		String naam= names.get(i);
		if(naam.toUpperCase().startsWith("A")) {
			count++;
		}
	}
	System.out.println(count);
	}
	
	
	@Test
	public void streamsFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("Ankur");
		names.add("Pandey");
		names.add("Abhijeet");
		names.add("Mahesh");
		names.add("Sarvesh");
		
		//names start with alphabet A
		Long c= names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		Long d=Stream.of("Abhishek","Ankur","Pandey","Abhijeet").filter(s->
		{
		   s.startsWith("A");
		   return true;
		}).count();
				System.out.println("Value of d="+d);
	}
}
