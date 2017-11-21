
//<Md> <Mashrafi>
//APCS1 pd<1>
//HW<15> -- Wayne's World
//<2017>-<10>-<12>  

public class Coin {

    //instance variables
    private double value;
    public String upFace;
    private String name;
    private int flipCtr;
    private int headsCtr;
    private int tailsCtr;
    private double bias;

    //Constructors/Methods
    
    // set some initial variables 
    public Coin() {
	bias = 0.0;
	tailsCtr = 0;
	headsCtr = 0;
	flipCtr = 0;
	upFace = "heads";
    }

    // set initial values + name
    public Coin(String newName) {
	this();
	name = newName;
	assignValue();
    }

    //set initial values + name + upFace
    public Coin(String newName, String newFace){
	this();
	name = newName;
	upFace = newFace;
	assignValue();
    }

    //runs for a chance to get heads or tails. Adding bias will increase the probability of getting heads. 
    public String flip(){
	double variable = Math.random();
	
	variable += bias;
	
	if (variable < .5){
	    upFace = "tails";	 
	    tailsCtr += 1;   
	}else {
	    upFace  = "heads";
	    headsCtr += 1;
	}

	flipCtr +=1;
	return upFace;
    }

    public boolean equals(Coin other){
	return this.upFace.equals(other.upFace);
    }
    
    //return coin name and face    
    public String toString(){
	return name + " -- " + upFace;
    }

    //assign monetary worth based on name
    public void assignValue(){
	if (name == "quarter"){
	    value = .25;
	}
	else if  (name == "dime") {
	    value = .10;
	}
	else if  (name == "nickel") {
	    value = .05;
	}
	else if  (name == "penny") {
	    value = .01;
	}	
    }


}
