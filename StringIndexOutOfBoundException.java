package com.excp;

public class StringIndexOutOfBoundException {
	public static void main(String[] args) {
		String a  = "rahul" ;
		try {
			
			System.out.println(a.charAt(6));
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("invalid data");
		}
	}

}
