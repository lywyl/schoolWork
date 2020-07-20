package experiment;

import java.io.Serializable;

public class Person implements Serializable{
	protected int age;
	protected String sex,name;
	public Person(String name,String sex,int age) {
		this.age=age;
		this.name=name;
		this.sex=sex;
	}
	int getage() {
		return this.age;
	}
	String getname() {
		return this.name;
	}
	String getsex() {
		return this.sex;
	}
	void setname(String name) {
		this.name=name;
	}
	void setsex(String s) {
		this.sex=s;
	}
	void setage(int a) {
		this.age=a;
	}
	void display() {
		System.out.println("information :" + this.name +"  "+ this.sex +" "+ this.age);;
	}
}
