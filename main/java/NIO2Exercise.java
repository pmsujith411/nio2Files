package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class NIO2Exercise 
{
	public static Map<String, String> getExpiredTablets(String fileName, String manufacturer) throws IOException
	{
		Map<String, String> tabletMap = new HashMap<>();
		LocalDate date = LocalDate.now();
		
		Files.readAllLines(Paths.get(fileName)).stream().forEach(line -> {
			String[] lineOfData = line.split(",");
			LocalDate localDate = LocalDate.parse(lineOfData[3], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			if(localDate.isBefore(date) && lineOfData[1].equalsIgnoreCase(manufacturer))
				tabletMap.put(lineOfData[0], lineOfData[3]);
		});
		
		return tabletMap;
	}
	
	public static void getCurrentFolderFiles() throws IOException
	{
		Files.walk(Paths.get(".")).filter(file -> file.endsWith(".java")).forEach(System.out::println);
	}
	
	public static void fileSearch(String fileName, String abPath) throws IOException
	{
		Files.walk(Paths.get(abPath)).filter(file -> file.equals(fileName)).findFirst().ifPresent(System.out::println);
	}
}