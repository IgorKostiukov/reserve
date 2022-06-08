package com.syntax.class13;
import java.util.Scanner;
public class Hw5 {
	
	  public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	   	//write your code below
	    String str=givenString.replaceAll(" ","");
	    str=str.toLowerCase();
	    int count=0;
	    boolean con=true;

	   	for( int i=str.length()-1;i>=0;i--){
	  if (str.charAt(i)== str.charAt(count)) {
	        count++;
	    } else {
	    con=false;
	    }
	    
	   	
	  }
    System.out.println(con);
    inp.close();
	}

	}
