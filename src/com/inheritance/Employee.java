package com.inheritance;

public class Employee {
	protected float salary = 30000;
}

class Tester extends Employee {
	int bonus = 10000;

	public static void main(String[] args) {
		Tester t = new Tester();
		System.out.println(t.salary);
		System.out.println(t.bonus);

	}

}
