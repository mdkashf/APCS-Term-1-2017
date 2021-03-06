//<Md.> <Mashrafi>
//APCS1 pd<1>
//HW<16> -- <Get It While You Can>
//<2017>-<10>-<15>   


public class Driver
{

    
    public static void main( String[] args )
    {

	//build Objects from blueprint specified by class Coin

	//test default constructor
   
	Coin mine = new Coin();

	//test 1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//test 2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );

	//test toString() methods of each Coin
	System.out.println("mine: " + mine);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//test flip() method
	System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//test equals() method
	if ( yours.equals(wayne) ) 
	    System.out.println( "Matchee matchee!" );
	else
	    System.out.println( "No match. Firestarter you can not be." );

	
	//The variables below stores the total number of heads, tails, and flips made.
	//While totalHeads is less than 10, the while function keeps on flipping the coins and
	//updating the variables.
	
	int totalHeads = wayne.getHeadsCtr() + yours.getHeadsCtr();
	int totalTails = wayne.getTailsCtr() + yours.getTailsCtr();
	int totalFlips = wayne.getFlipCtr() + yours.getFlipCtr();
	while (totalHeads < 10){
	    wayne.flip();
	    yours.flip();
	    totalHeads = wayne.getHeadsCtr() + yours.getHeadsCtr();
	    totalTails = wayne.getTailsCtr() + yours.getTailsCtr();
	    totalFlips = wayne.getFlipCtr() + yours.getFlipCtr();	    
	}
	
	//Prints summery information after while is done. 
	System.out.println("______________________________________\n");
	System.out.println("Flips until 10 heads  ");
	System.out.println(totalFlips);
	System.out.println("________________\n");
	System.out.println("Heads ");
	System.out.println(totalHeads);
	System.out.println("________________\n");
	System.out.println("Tails ");
	System.out.println(totalTails);
	System.out.println("______________________________________\n");



	//totalMatches store the number of times the objects have has the same face.
	//While totalMatches is less than 10, the function will keep fliping the coins.
	int totalMatches = 0;
	while (totalMatches < 10){
	    
	    if ( yours.equals(wayne)){
		totalMatches += 1;
	    }
	    yours.flip();
	    wayne.flip();
	}

	//Prints summery information after while is done. 
	System.out.println("Flips until 10 matches");	
	System.out.println(yours.getFlipCtr());
	System.out.println("________________\n");
	System.out.println("Total Matches ");
	System.out.println(totalMatches);
	System.out.println("______________________________________\n");


	//The 'while' function starts running until total matches is larger than 13000 and is a multiple of 2001
	
	 totalMatches = 0;
	while (true){
	    yours.flip();
	    wayne.flip();
	    if ( yours.equals(wayne)){
		totalMatches += 1;
	    }
	    if ( (totalMatches > 13000) && (totalMatches % 2001 ==  0)){
		break;
	    }
	    
	}

	//Prints summery information after while is done. 
	System.out.println("Flips until 13000 matches and is multiple of 2001");	
	System.out.println(yours.getFlipCtr());
	System.out.println("________________\n");
	System.out.println("Total Matches ");
	System.out.println(totalMatches);
	System.out.println("______________________________________\n");

    }//end main()

}//end class
