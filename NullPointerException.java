package com.excp;

public class NullPointerException {
	public static void main(String[] args) {
		try {
			String a  = null;
			System.out.println(a.length());
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("invalid data");
		}
	}

}
