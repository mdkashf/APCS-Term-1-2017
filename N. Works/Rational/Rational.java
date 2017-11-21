//MD MASHRAFI
//APCS1 pd 1
//HW 37 -- Be More Rational
//2017-11-21   

public class Rational {
    int num;
    int dem;

    public Rational(){
	Rational Rational = new Rational( 0 , 1);
    }

    public Rational(int n, int d){
	if (d == 0 ){ // if denominator input leads to undefined
	    System.out.println( "Invalid rational"); // return error msg
	} else {
	    num = n; // set values for the instance variables
	    dem = d;
	}
    }

    public String toString(){
	return num + "/" + dem; // return String representation of Fraction
    }

    public double floatValue(){
	return ((double)num) /((double) dem); // return the value of the fraction
    }


    
    public void multiply(Rational a){
	num = num * a.num; // multiplies own numerator with input numerator
	dem = dem * a.dem; // multiplies own denominator with input denominator
    }

    public void divide(Rational a){
	num = num / a.num; // divides own numerator with input numerator
	dem = dem / a.dem; // divides own denominator with input denominator
    }

    private static int gcd (int a, int b){
	if (b==0) return a;
	return gcd(b,a%b);
    }

    private static int lcm(int a, int b){
	return a * (b / gcd(a, b));
    }
    
    public void add(Rational a){
	int m1 = lcm( a.dem, dem) / dem; // what the variable of this should multiply by
	int m2 = lcm( a.dem, dem) / a.dem; // what the variable of input should multiply by
	dem = (dem * m1); // common denominator
	num = (num * m1) + ( a.num * m2); // manipulate to get new num
    }

    public void subtract(Rational a){
	int m1 = lcm( a.dem, dem) / dem; // what the variable of this should multiply by
	int m2 = lcm( a.dem, dem) / a.dem; // what the variable of input should multiply by
	dem = (dem * m1); // common denominator
	num = (num * m1) - ( a.num * m2); // manipulate to get new num
    }

    public void reduce(){
	int gcdThis = gcd(num , dem ); // gcd of num and dem
	num /= gcdThis; // reducing num
	dem /= gcdThis; // reducing dem
    }

    public int compareTo (Rational a){
	if ( this.floatValue() == a.floatValue()){
	    return 0;
	} else if (this.floatValue() > a.floatValue()){
	    return 1;
	} else {
	    return -1;
	}
    }

    public static void main (String [] args ){

	System.out.println("---------------------------------------");
	//tests
	//Initializaton
	Rational r = new Rational(2,3);
	Rational s = new Rational(1,2);
	Rational t = new Rational(4,18);
	System.out.println(s.toString() + " : Original s");
	System.out.println(r.toString() + " : Original r");
	System.out.println(t.toString() + ": Original t");
	System.out.println("---------------------------------------");

	//Multiply
	r.multiply(s);
        System.out.println(r.toString() + " : New r when multiplied by s");
	System.out.println("---------------------------------------");
	
	//Divide
	r.divide(s);
	System.out.println(r.toString() + " : New r when divided by s");
	System.out.println("---------------------------------------");
	
	//Float Value
	//System.out.println(r.floatValue() + " : Float value of r");

	//add
	r.add(s);
	System.out.println(r.toString() + " : Adding r and s");
	System.out.println("---------------------------------------");
	
	//subtract
	r.subtract(s);
	System.out.println(r.toString() + " : Subtracting r and s");
	System.out.println("---------------------------------------");
	
	//reduce
	r.reduce();
	System.out.println(r.toString() + " : Reducing r");
	t.reduce();
	System.out.println(t.toString() + " : Reducing t");
	System.out.println("---------------------------------------");
	
	//compareTo
	System.out.println(r.compareTo(s) + "   : r compared to s");
	System.out.println(s.compareTo(r) + "  : s compared to r");
	System.out.println(r.compareTo(r) + "   : r compared to r");
	System.out.println("---------------------------------------");
	
    }
    
}
