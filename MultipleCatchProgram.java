package com.excp;

public class MultipleCatchProgram {
	public static void main(String[] args) {
		String a []  = {"rahul" , "geja" , "pechi"};
		
		
		try {
			System.out.println(a[1].charAt(7));
			System.out.println(a[5]);
			
		}
		catch(StringIndexOutOfBoundsException s ) {
			s.printStackTrace();
		}
		catch(IndexOutOfBoundsException i) {
			i.printStackTrace();
		}
		catch(Exception f) {
			f.printStackTrace();
		}
		
	}

}
