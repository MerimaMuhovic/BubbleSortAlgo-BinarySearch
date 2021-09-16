package homework3Bubble;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;



public class Exe {

	public static void main(String[] args) throws IOException {
	
		String path = "C://Users//user//Desktop//DataStructure//IP-COUNTRY-REGION-CITY-SHUFFLED.csv";
		
		IPAddress[] ipAddresses = new IPAddress[10000];
	
	}
	
	public static void read(String path, IPAddress[] array) throws FileNotFoundException {
		
        Scanner scanner = new Scanner(new File(path));
        
     /*  while (scanner.hasNextLine()) {
        	String [] values = scanner.nextLine().split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
        
        scanner.close();
    }*/
        
        for(int i =0; i < array.length; i++) {
        	String [] ipAddress = scanner.nextLine().split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");

        	for(int j=0; j< ipAddress.length; j++ ) {
        		ipAddress[j]= ipAddress[j].replaceAll("/ ", "");
        	}
        	
        	
        }
        
      scanner.close();
      
}
	
	public static void writeFile(String path, IPAddress[]array) throws IOException{
		
		File file = new File(path);
		FileWriter writerFile= new FileWriter(file);
		
		for(int i=0; i < array.length ; i++) {
			writerFile.write(array[i].toString());
		}
		
		writerFile.close();
	}
	
}