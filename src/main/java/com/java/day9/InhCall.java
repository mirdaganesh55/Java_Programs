package com.java.day9;

public class InhCall extends InhData {
	void meth2() {
		System.out.println("InhCall is called...");
	}
	public static void main(String[] args) {
		InhData obj1 = new InhData();//Has-A relation because here we neednot to extendes the data...
		obj1.meth1();
//		obj1.meth2();
		System.out.println("------------");
		InhData obj2 = new InhCall();// This is which Relationship sir??....
		obj2.meth1();
//		obj2.meth2();
		System.out.println("------------");
		InhCall obj3 = new InhCall();// IS-A relation 
		obj3.meth1();
		obj3.meth2();
	}
}
