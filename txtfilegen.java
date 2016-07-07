package txtfilegen;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.UUID;

public class txtfilegen {
	
	
	
	public static void main( String[] args )
    {	
		
		int max = 9;
		int min = 1;

        for (int i = 1; i<101; i++){
        	
        	// Create UUID
            UUID uuid = UUID.randomUUID();
            String ranUUID = uuid.toString();
        
		try {
			//Generate Character
			Random r = new Random();
			char letter = (char) (r.nextInt(26) + 'a');
			
			//Generate Numbers
			Random rand = new Random();
		    int randomNum1 = rand.nextInt((max - min) + 1) + min;
		    int randomNum2 = rand.nextInt((max - min) + 1) + min;
		    int randomNum3 = rand.nextInt((max - min) + 1) + min;
		    int randomNum4 = rand.nextInt((max - min) + 1) + min;
		    int randomNum5 = rand.nextInt((max - min) + 1) + min;
	      
		    PrintWriter writer = new PrintWriter("C:\\XML\\SystemFix\\Red\\"+ ranUUID +".txt", "UTF-8");
		    writer.println("<doc>");
		    writer.println("<field>Source</field>");
		    writer.println("<value>" + letter + randomNum1 + randomNum2 + randomNum3 + randomNum4 + randomNum5 + "</value>");
		    writer.println("</doc>");
		    writer.close();

    		} catch (IOException e) {
    			e.printStackTrace();
    		}
        }
    }
}

