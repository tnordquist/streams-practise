package edu.cnm.hsd.java8streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yello", "Green"}; {
		
	}
    public static void main( String[] args ) {
       
//    	long count = Arrays.stream(colors).count();
    	
    	long count = Arrays.asList(colors).stream()
    			.distinct()
    			.count();
    	
    	Arrays.asList(colors).stream()
    			.distinct()
    			.forEach(System.out::println);
    	
//    	long count = Stream.of(colors).count();
    	
    	System.out.println(count);
    	
    }
}
