package txtfilegen;

import java.util.UUID;

public class createuuid {
	// Create UUID
	
	String uuidint () {
	
    UUID uuid = UUID.randomUUID();
    String ranUUID = uuid.toString();
    
    return ranUUID;
}
}