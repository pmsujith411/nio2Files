package main.java;

import java.io.IOException;
import java.util.Optional;

public class Test 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Display expired tablet names and expiry date");
		NIO2Exercise.getExpiredTablets("E:/input/input.txt", "manufacturer3").forEach((k, v) -> System.out.println(k + ": " + v));
		System.out.println();
		
		System.out.println("Display all the file names ending with .java");
		NIO2Exercise.getCurrentFolderFiles();
		System.out.println();
		
		System.out.println("Display the status of search result");
		Optional<String> optional = NIO2Exercise.fileSearch("input.txt", "E:/input/");
		
		if(optional.isPresent())
			System.out.println("Found the given text");
		else
			System.out.println("Not found");
	}
}
