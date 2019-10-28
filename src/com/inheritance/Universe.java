package com.inheritance;

class TestInheritance {
	void Circle() {
		System.out.println("Planets");
	}
}

class Planets extends TestInheritance {
	void Life() {
		System.out.println("Humans");
	}
}
class Country extends Planets
{
	void States()
	{
		System.out.println("Leaders");
	}
}

public class Universe {
	public static void main(String args[]) {
		Country  p = new Country();
		p.Circle();
		p.Life();
		p.States();

	}
}