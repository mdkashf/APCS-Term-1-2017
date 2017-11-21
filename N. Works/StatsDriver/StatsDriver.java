public class StatsDriver{

    public static void main(String[] args){
	
	System.out.println("____________________________________________________________\n");
	System.out.println( mean( 10, 90, 200));
	// 100
	System.out.println("____________________________________________________________\n");
	System.out.println( mean( 12.231, 213.1, 367));
	// 197.443666...
	System.out.println("____________________________________________________________\n");
	System.out.println( max( 2, 3, 1));
	// 3
	System.out.println("____________________________________________________________\n");
	System.out.println( max( 10.123, 12.12321, 21));
	// 21
	System.out.println("____________________________________________________________\n");
	System.out.println( geoMean( 2, 18, 2));
	// 4
	System.out.println("____________________________________________________________\n");
	System.out.println( geoMean( 12.5, 10.5, 12));
	// 11.634833857252808
	System.out.println("____________________________________________________________\n");
	System.out.println( mean( 6, -6, -6));
	// -2
	System.out.println("____________________________________________________________\n");

	
    }
}
