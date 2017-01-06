public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{       
	for ( int i = 2; i< e.length()-9; i++){
		String numbers = e.substring(i,i+10);
		double dubNum = Double.parseDouble(numbers);
		if ( isPrime(dubNum) == true){
				System.out.println(dubNum); 
		}
		 
	}
	
	
     noLoop();  
}  
public void draw()  
{   
	
	//not needed for this assignment
}  
public boolean isPrime(double dubNum)  
{   
	if (dubNum < 2){
		return false;
	}
	else{
		for ( int i =2; i <= Math.sqrt(dubNum); i++){
			if ( dubNum % i == 0){
				return false; 
			}
		}
		return true;
	}
    //to be finished later   
  
} 