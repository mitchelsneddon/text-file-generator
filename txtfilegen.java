package txtfilegen;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
			List<String> list = new ArrayList<String>();
			list.add("A12345");
			list.add("B98765");
			list.add("C11111");				
			list.add("D99999");
			list.add("E15975");
			String random = list.get(new Random().nextInt(list.size()));
			

	PrintWriter writer = new PrintWriter("C:\\XML\\SystemFix\\Red\\"+ ranUUID +".txt", "UTF-8");
		    writer.println("<doc>");
		    writer.println("<field>Source</field>");
		    writer.println("<value>" + random +"</value>");
		    writer.println("</doc>");
		    writer.close();

    		} catch (IOException e) {
    			e.printStackTrace();
    		}
        }
    }
}