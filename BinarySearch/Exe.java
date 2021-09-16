package homework3Binary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import homework3Bubble.IPAddress;

public class Exe {

	public static void main(String[] args) throws IOException {
		String path = "C://Users//user//Desktop//DataStructure//IP-COUNTRY-REGION-CITY-SORTED.csv";
		
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
public static long IPLong (int[] arr) {
	
	long longIP= (long)(16777216 * arr[0]+ 65536 * arr[1]+ 256 * arr[8 + arr[3]]);
	return longIP;
}

public static void IPLong(String s, int[] arr) {
	String[] part= s.split("//");
	
	for(int k=0; k<4; k++) {
		arr[k]=Integer.parseInt(part[k]);
	}
}

public static void search(IPAddress[] arr, long key) {
	
	int result= BinarySearch.search(arr, key);
	if(result!=-1) {
		System.out.println(" ");   //////////////
	}else {
		System.out.println("Not found");
	}
}

}
