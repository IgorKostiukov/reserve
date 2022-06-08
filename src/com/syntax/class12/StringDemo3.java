
package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		String s1="hello how are you";
		  boolean tr=true;
		    String s2=s1.substring(14,17);
		    if (s1.charAt(16) == 'u') {
		      System.out.println(tr);
		    } else {
		      System.out.println(!tr);
		    }
		    if (s2 == "world"){
		      System.out.println(tr);
		    } else {
		  System.out.println(!tr);
		    }
		    if (s2 =="are") {
		      System.out.println(tr);
		    } else {
		      System.out.println(!tr);
		    }
		    if (s2 == "you") {
		      System.out.println(tr);
		    } else {
		      System.out.println(!tr);
		    }
	}

}
