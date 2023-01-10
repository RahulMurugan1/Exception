package com.excp;

import java.io.IOException;

public class CheckVoterAge {
	public static void main(String[] args)  throws AgeException , IOException, Exception {  
//		int a  = 16 ;
//		try {
//			if(a>=18) {
//				throw new AgeException("Eligible") ;
//			}
//			else { 
//				System.out.println("not eligible");
//			}
//		}
//			catch (Exception e) {
//				e.printStackTrace();
//			}
//			}
//		
//		
		String a  = "rahulmurugan304gmail.com" ;
		try {
			if(a.contains("@gmail.com") || a.endsWith("@yahoo.com")) {
				System.out.println("Eligible") ;
			}
			else { 
				throw new AgeException("not eligible");
			}
		}
			catch (Exception e) {
				e.printStackTrace();
			}
			}
		
		
	}


