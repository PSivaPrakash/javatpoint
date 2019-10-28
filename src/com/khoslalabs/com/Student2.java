package com.khoslalabs.com;

class Student2 {
	int id;
	String Name;
	static String College = "VSKP";

	void insert(int i, String n) {
		id = i;
		Name = n;
	}

	void display() {
		System.out.println("College Name : " + College + " ID Number : " + id + " Name : " + Name);
	}

	public static void main(String[] args) {

		Student2 S2 = new Student2();
		Student2 S3 = new Student2();
		Student2 S4 = new Student2();
		S2.insert(222, "PSP");
		S3.insert(333, "MSP");
		S4.insert(444, "QSP");
		S2.display();
		S3.display();
		S4.display();

	}

}
