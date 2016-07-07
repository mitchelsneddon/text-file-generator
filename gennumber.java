package txtfilegen;

import java.util.Random;

public class gennumber {

	int max = 9;
	int min = 1;
	
	//int randomNumn() {
	//Random rand = new Random();
    //int value = rand.nextInt((max - min) + 1) + min;
    
	String xxxxx(){
	
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
    
    String value = "" + letter + randomNum1 + randomNum2 + randomNum3 + randomNum4 + randomNum5;
    
    return value;
	}
}

