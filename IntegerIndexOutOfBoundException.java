package com.excp;

public class IntegerIndexOutOfBoundException {
	public static void main(String[] args) {
		String a  = "rahul" ;
		int c  = 1  ; 
		int b  =3 ; 
		 int d  = 4 ;
		 int f[] = {c,b,d};
		System.out.println(f[5]);
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
