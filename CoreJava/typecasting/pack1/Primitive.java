package com.tyss.typecasting.pack1;

public class Primitive {
	byte b=9;
	short s=b;
	float f=b;
	double d=b;
	int i=b;
	void value(){
		System.out.println(b);
		System.out.println(s);
		System.out.println(f);
		System.out.println(d);
		System.out.println(i);
	}
	//explicit type casting
	double pi=3.142;
	int c=(int) pi;
	void details() {
		System.out.println(c);
		System.out.println(pi);
	}
	public static void main(String[] args) {
		Primitive p1=new Primitive();
		p1.value();

		p1.details();
	}
}
