package com.inheritance;
import com.inheritance.*;
public class Aggregation {
	int id;
	String name;
	Address address;

	public Aggregation(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	void display() {
		System.out.println(id + " " + name + " " + address.city + " " + address.state + " " + address.country);
	}
	public static void main(String[] args) 
	{
	Address add = new Address();
	add.city = "vzg";
	add.state = "bangalore";
	add.country = "india";

	Aggregation e = new Aggregation(111,"Siva Prakash",add);
	e.display();

	}
}


