import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{       
	
	String numbers = e.substring(2,12);
	double dubNum = Double.parseDouble(numbers);
	
		System.out.println(numbers);  
	
	
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
				return true; 
			}
		}
		return false;
	}
    //to be finished later   
  
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
