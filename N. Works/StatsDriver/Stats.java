//Md. Kashf Mashrafi
//APCS1 pd1
//HW13 -- May ah Hahv S’maur, Please?  
//2017-10-6   





public class Stats {

    // method returns the sum of all three inputs divided by 3.
    
    public static int mean(int a, int b, int c){
	return ( ( a + b + c )
		 / 3 );
    }

    public static double mean(double a, double b, double c){
	return ( ( a + b + c )
		 / 3 );
    }


    // conditional checks to see if b is greater than a and sets b to a if so.
    // second conditional sees if c is greater than a and sets a to c if so.
    // with this, the method will end up with the highest number inputted set to a, which is then returned. 
    
    public static int max(int a, int b, int c){
	
	if (b > a) {
	    a = b;
	}

	if (c > a) {
	    a = c;
	}

	return a;
	
    }

    public static double max(double a, double b, double c){
	
	if (b > a) {
	    a = b;
	}

	if (c > a) {
	    a = c;
	}
	
	return a;
    }

    //gcdER

    public int gcdER(int a, int b){
	if (b % a == 0){
	    return a;
	} else{
	    if ( a > b ){
		a -= b;
	    } else {
		b -= a;
	    }
	    if (a == 0 || b == 0){
		if (a == 0){
		    return b;
		}else {
		    return a;
		}
	    } else {
		return GCD(a ,b);
	    }
	}
    }

    //gcd

    
    // Each geoMean method takes in  3 ints or doubles that are first multiplied togather.
    // Then raised to the power of 1/3, ( if an int primitive is needed, method converts answer to int).
    // finally, the answer is returned
    
    public static int geoMean(int a, int b, int c) {

	return (int) Math.pow((a * b * c) , 1/3.0);
	   
    }
    
    public static double geoMean(double a, double b, double c){

	return Math.pow((a * b * c) , (1/3.0));

    }

    
  
    public static void main(String[] args){
	System.out.println("____________________________________________________________\n");
	System.out.println( mean( 10, 90, 200)); // 100
	System.out.println("____________________________________________________________\n");
	System.out.println( mean( 12.231, 213.1, 367));// 197.443666...
	System.out.println("____________________________________________________________\n");
	System.out.println( max( 2, 3, 1)); // 3
	System.out.println("____________________________________________________________\n");
	System.out.println( max( 10.123, 12.12321, 21)); // 21
	System.out.println("____________________________________________________________\n");
	System.out.println( geoMean( 2, 18, 2)); // 4
	System.out.println("____________________________________________________________\n");
	System.out.println( geoMean( 12.5, 10.5, 12)); // 11.634833857252808
	System.out.println("____________________________________________________________\n");
	System.out.println( mean( 6, -6, -6)); // -2
	System.out.println("____________________________________________________________\n");

	
    }
}
