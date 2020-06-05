package main.java;

import java.io.IOException;

public class Test 
{
	public static void main(String[] args) throws IOException 
	{
		NIO2Exercise.getExpiredTablets("C:/in/input.txt", "manufacturer3").forEach((k, v) -> System.out.println(k + ": " + v));
		NIO2Exercise.getCurrentFolderFiles();
		NIO2Exercise.fileSearch("input.txt", "C:/in/");
	}
}
