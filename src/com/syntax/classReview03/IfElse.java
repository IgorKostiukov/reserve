package com.syntax.classReview03;

public class IfElse {
public static void main(String[] args) {
	String day="Monday";
	String wk;
	if(day.equals("Monday") || "Tuesday".equals(day)|| "Wednesday".equals(day)||"Thursday".equals(day)||"Friday".equals(day)){
		 wk="Weekday";
	} else if("Saturday".equals(day) || "Sunday".equals(day)){
		 wk="Weekend";
	} else {
	wk="Not a valid day";
}
System.out.println(wk);
}
}
