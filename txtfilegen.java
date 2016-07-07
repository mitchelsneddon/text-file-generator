package txtfilegen;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.UUID;

public class txtfilegen {
	
	
	
	public static void main( String[] args )
    {	
		
        for (int i = 1; i<101; i++){
        	//Create UUID
        	createuuid uuid = new createuuid();
        	String ranUUID = uuid.uuidint();
        
		try {
			gennumber test = new gennumber();
			String xxxxx = test.xxxxx();
			

	PrintWriter writer = new PrintWriter("C:\\XML\\SystemFix\\Red\\"+ ranUUID +".txt", "UTF-8");
		    writer.println("<doc>");
		    writer.println("<field>Source</field>");
		    writer.println("<value>" + xxxxx +"</value>");
		    writer.println("</doc>");
		    writer.close();

    		} catch (IOException e) {
    			e.printStackTrace();
    		}
        }
    }
}

