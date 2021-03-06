//PorkChops- Clarence Cheng, MD Mashrafi, Ben Shapiro
//APCS pd1
//HW23 -- Etterbay Odingcay Oughthray Ollaborationcay
//2017-10-25

/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 *
 *       NOTES:
 *	/* =====================================

	*/

        /* TO-DO LIST
	   - Make code cleaner
	   - Integrate existing methods into the new ones
	   - Clean/Create instance variables with proper labels.
        */
//================================= CODE - BELOW ============================================

public class Pig
{
    //Q: How does this initialization make your life easier?
    private static final String VOWELS = "aeiou";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") -> true
      hasA("cat", "p")       -> false
      =====================================*/
    public static boolean hasA( String w, String letter ) 
    {
	int count = 0;//counter to count
	int is = 0; //records T or F, greater than 0 T ortherwise F, prevents returning True/False for each iteration
	for(;count<w.length();count++){//runs through w lloking for a match
	    if (w.substring(count,count+1).equals(letter)){//if matches
		is += 1;
	    }
	}
	return is > 0;//T or F
		  
    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) 
    {

	return hasA( VOWELS, letter); //is the letter in Vowels?
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -> 3
      =====================================*/
    public static int countVowels( String w ) 
    {

	int countV = 0;
	for ( int i = 0; i < w.length() ; i++){
	    String Character = "" + w.charAt( i); 
	    if (isAVowel ( Character)){ // if char index i of string w is a vowel -- update counter
		countV ++;
	    }
	}
	return countV;
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") -> true
      hasAVowel("zzz")       -> false
      =====================================*/
    public static boolean hasAVowel( String w ) 
    {
	return countVowels(w) > 0;//sees if there is at least one vowel
    }


    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
      =====================================*/
    public static String allVowels( String w ) 
    {
	String vStr = "";

	for (int i = 0 ; i < w.length() ; i++ ){
	    if ( VOWELS.indexOf( w.charAt(i)) != -1 ){ //if the index i of string w is in the VOWELS, that char is added to the string.
		vStr +=  w.charAt(i);
	    }   
	}
	return vStr;
    }
    /*=====================================
    //pre: w != null
    //post: firstVowel("") --> ""
    //      firstVowel("zzz") --> ""
    //      firstVowel("meatball") --> "e"
    =====================================*/

    public static String firstVowel(String w){
	if ( countVowels(w) > 0 ) { // If there are any vowels in the string w .. 
	    return allVowels(w).substring(0,1);//returns first of all vowels
	}
	return ""; //returns empty string if not vowels
        
    }
    
    /*=====================================
      pre: w != null and w.length() > 0
      post: beginsWithVowel("apple")  --> true
      beginsWithVowel("strong") --> false
      =====================================*/
    
    public static boolean  beginsWithVowel(String w){
	return isAVowel(w.substring(0,1));//sees if first letter is a vowel
    }
    
    /*=====================================
      pre: w.length() > 0
      post: engToPig("apple")  --> "appleway"
      engToPig("strong") --> "ongstray"
      engToPig("java")   --> "avajay"
      ===================================== */



    public static  String engToPig(String w){
	if ( beginsWithVowel(w) ){
	    return w + "way";
	}
	// if not, then half the string from the front is placed in the back with "ay added"
	else{
	    if (w.substring(0,1).toUpperCase().equals(w.substring(0,1))){
		return w.substring(w.indexOf(firstVowel(w))).substring(0,1).toUpperCase() + w.substring(w.indexOf(firstVowel(w))).substring(1)  + w.substring(0, w.indexOf(firstVowel(w))).toLowerCase() + "ay";
       
	    }
	    else{
		return w.substring(w.indexOf(firstVowel(w))) + w.substring(0, w.indexOf(firstVowel(w))) + "ay";
       
	    }
	}

    }



    public static void main( String[] args ) 
    {
	/*
	System.out.println("--------------------------hasA");
	System.out.println(hasA("cat","a"));//T
	System.out.println(hasA("cat","p"));//F
	System.out.println("--------------------------isAVowel");
	System.out.println(isAVowel("a"));//T
	System.out.println(isAVowel("e"));//T
	System.out.println(isAVowel("b"));//F
	System.out.println(isAVowel("i"));//T
	System.out.println("--------------------------countVowels");
	System.out.println(countVowels("meatball"));//3
	System.out.println(countVowels("roar"));//2
	System.out.println(countVowels("sdfgh"));//0
	System.out.println("--------------------------hasAVowel");
	System.out.println(hasAVowel("cat"));//T
	System.out.println(hasAVowel("zzz"));//F
	System.out.println("--------------------------allVowels");
	System.out.println(allVowels("meatball"));//eaa
	System.out.println(allVowels("roarmeatball"));//oaeaa
	System.out.println("--------------------------firstVowel");
	System.out.println(firstVowel(""));//""
	System.out.println(firstVowel("zzz"));//""
	System.out.println(firstVowel("meatball"));//"e"
	System.out.println("--------------------------beginsWithVowel");
	System.out.println(beginsWithVowel("apple"));//true
	System.out.println(beginsWithVowel("strong"));//false
	System.out.println("--------------------------engToPig");
	System.out.println(engToPig("apple"));//appleway
	System.out.println(engToPig("strong"));//ongstray
	System.out.println(engToPig("java"));//avajay
	System.out.println(engToPig("Hello"));//
	*/

	for ( String s : args) {
	    System.out.println(engToPig("java"));
}

      
    }//end main()

}//end class Pig
