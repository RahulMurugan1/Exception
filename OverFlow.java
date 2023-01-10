package com.excp;

public class OverFlow {
public int funA() {
	return funB();
}
public int funB() {
	return funA();
}
public static void main(String[] args) {
	OverFlow of  = new OverFlow() ;
	System.out.println(of.funB());
}
}
