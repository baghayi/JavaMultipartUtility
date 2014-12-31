import java.io.File;
import java.io.IOException;
import java.util.List;

import org.adeveloper.Multipart.Headers;
import org.adeveloper.Multipart.Utility;


public class Main {

    public static void main(String[] args) {
    	
    	/**
    	 * File name like: /home/hossein/Pictures/experience-picture.png
    	 */
    	File file = new File("filename in your system");
    	
    	/**
    	 * Resource URI
    	 */
    	String resourceUri = "";

    	try {
    		Utility multipart = new Utility();
    		
    		Headers headers = new Headers();
    		headers.add("Authorization", "Bearer YOUR_ACCESS_TOKEN");
    		headers.add("Accept", "application/json");
    		multipart.setHeaders(headers);
    		
    		multipart.connect(resourceUri);
    			
			multipart.addFilePart("photo", file);

			List<String> response = multipart.finish();

			for (String line : response) {
				System.out.println(line);
			}
			
    	} catch (IOException ex) {
    		System.err.println(ex);
    	}
    }
}
