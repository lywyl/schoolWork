package experiment;

import java.io.*;
public class testMyfile {
	Student[] s1s;

	public static void main(String[] args) {
	try {
		/*Myfile file2=new Myfile("teststudent.txt");
		Student[] s1s = new Student[100];
		//Electivecourse[] e=new Electivecourse[10];
		Student stu=new Student("1234","liux","male",18,"computer");
		Student stu1=new Student("1245","liy","male",20,"computer");
		Student stu2=new Student("1246","liz","male",16,"computer");
		//Electivecourse ele =new Electivecourse("B2098","201801924","__34");
		//Electivecourse ele2 =new Electivecourse("B2099","201801925","__35");
		//file2.WriteFile(ele);
		//file2.WriteFile(ele2);
		//file2.readfile(e);
		
		file2.WriteFile(stu);
		file2.WriteFile(stu1);
		file2.WriteFile(stu2);
		int a=file2.readfile(s1s);
		for(int i=0;i<a;i++) {
			s1s[i].display();
		}
		*/
		/*Myfile file2=new Myfile("testElective.txt");
		Electivecourse[] e=new Electivecourse[10];
		Electivecourse ele =new Electivecourse("B2098","201801924","__34");
		Electivecourse ele2 =new Electivecourse("B2099","201801925","__35");
		file2.WriteFile(ele);
		file2.WriteFile(ele2);
		file2.readfile(e);
		int a=file2.readfile(e);
		for(int i=0;i<a;i++) {
			e[i].display();
		}*/
		Myfile file2=new Myfile("testPerson.txt");
		Person[] per= new Person[100];
		Person p1=new Person("zhangs","male",20);
		Person p2=new Person("ruqi","fmale",30);
		Person p3=new Person("maliyia","fmale",19);
		Person p4=new Person("chenhon","fmale",20);
		file2.WriteFile(p1);
		file2.WriteFile(p2);
		file2.WriteFile(p3);
		file2.WriteFile(p4);
		int count=file2.readfile(per);
		for(int i=0;i<count;i++) {
			per[i].display();
		}
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
