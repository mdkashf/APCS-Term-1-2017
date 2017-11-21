//<Md.> <Mashrafi>
//APCS1 pd<1>
//HW<17> -- <Do I repeat myself? Very well, then I repeat myself  I am possibly unending, I contain potentially multitudes>
//<2017>-<10>-<16>   


public class Repeater{

    //While numPost is above 0 and is greater than 1, a new section gets added to the fence.
    //At the end when the numPost is 1, the last line is added to the fence. 
    public String fenceW(int numPost){
	String fence = "";
	while (numPost > 0){
	    if (numPost > 1){
		fence += "|--";
	    }else{
		fence += "|";
	    }
	    numPost -=1;
	}
	return fence;
    }

    //If numPost is 1, the last post is added to the fence.
    //if the numpost is greater than 1, a section is added and the method is called again to add to the fence.
    public String fenceR(int numPost){
	String fence = "";
	
	if (numPost == 1){
	     fence +="|";
	}
	
	if (numPost > 1) {
	  fence +="|--";
	  fence += fenceR(numPost - 1);
	}
	
	return fence;
	
    }


    //tests
    public static void main(String [] args){
	//new instance
	Repeater bob = new Repeater();

	//fenceW test
	System.out.println(bob.fenceW(1));
	System.out.println(bob.fenceW(2));
	System.out.println(bob.fenceW(3));
	System.out.println(bob.fenceW(4));

	//fenceR test
	System.out.println(bob.fenceR(1));
	System.out.println(bob.fenceR(2));
	System.out.println(bob.fenceR(3));
	System.out.println(bob.fenceR(4));
    }
}
