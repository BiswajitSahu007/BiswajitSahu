package com.tyss.typecasting.pack2;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Animal();
		a1.eating();
		System.out.println("-----------------");
		Animal a2=new Dog();
		a1.eating();
		System.out.println("-----------------");
		Dog d1=(Dog)a2;
		d1.eating();
		d1.walking();
		
		Animal a3=new Lion();
		
		Lion l1=(Lion)a3;
		l1.eating();
		l1.walking();
	}

}
