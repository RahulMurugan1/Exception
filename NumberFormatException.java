package com.excp;

public class NumberFormatException {
	public static void main(String[] args) {
		String a  = "rahul"  ;
		try {
			int b  = Integer.parseInt(a);
			System.out.println(b);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("invalid data");
		}
	}


}
