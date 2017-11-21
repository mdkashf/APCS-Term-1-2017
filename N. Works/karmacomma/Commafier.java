//<MD> <MASHRAFI>
//APCS1 pd<1>
//HW<n> -- Karmacomma
//<2017>-<10>-<25>  


public class Commafier{

    public static String commafyF(int n){
	// initialization of instance variables
	String s = Integer.toString(n);
	int len = s.length(); //len is for easier understanding
	int cnt = 0;
	String s2 = "";
	
	for (int i = len - 1; i > -1; i--){
	    //Counter : based on what cnt is, every time the body is run, the counter will update in [1,3]
	    if ( cnt == 0){
		cnt ++;
	    } else if ( cnt == 1){
		cnt ++;
	    }else if ( cnt == 2){
		cnt ++;
	    }else if ( cnt == 3){
		cnt = 1;
	    }

	    // When cnt == 1 ; the current char of the index is added, with a comma, into the previous s2.
	    // If not, the char is just added with out the comma
	    if ( cnt == 1) {
		s2 = s.charAt(i) + "," + s2;
	    } else {
		s2 = s.charAt(i) + s2;
	    }		
	}

	//this commafyF method is not very polished.
	//The answer returned always has an extra comma at the end; so the 'return' edits out the last comma. 
	return  s2.substring(0, s2.length() - 1);
    }



    public static String commafyR(int n){
	//adding an int to an empty string turns the int into a String
	String s = "" + n;

	//Base-case: If the length of the String is less than  ( meaning it has 3 digits), return the s itself as it does not need a comma added to it.	
	if(s.length() < 4)
	    return s;

	// a comma and last 3 digits of the string is set to be added after the function is called again on a new string that does not contain the last 3 digits.
        return  commafyR(Integer.parseInt(s.substring(0,s.length()-3))) + "," +  s.substring(s.length() - 3);

    }

    public static void main ( String [] args ){

	/*	Commafier test = new Commafier();
		System.out.println(test.commafyF(123456789));
		System.out.println(test.commafyF(12345678));
		System.out.println(test.commafyF(1234567));
		System.out.println(test.commafyF(123456));

		System.out.println(test.commafyR(123456789));
		System.out.println(test.commafyR(12345678));
		System.out.println(test.commafyR(1234567));
		System.out.println(test.commafyR(123456));
	*/

	for ( String s : args) {
	    int temp = Integer.parseInt(s);
	    System.out.println ( "commafyF(" + temp + "):" +  commafyF(temp) );
	    System.out.println ( "commafyR(" + temp + "):" +  commafyR(temp) );
	}


    }

}
