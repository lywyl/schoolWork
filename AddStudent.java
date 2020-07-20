package experiment;

import java.util.Scanner;

public class AddStudent {
	public static void main(String[] args) {
		String sid,name,sex,major;
		int age;
		Myfile filet=new Myfile("testStudent.txt");
		System.out.println("enter student info");
		Scanner getIn = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			
			sid=getIn.next();
			
			name=getIn.next();
			sex=getIn.next();
			age=getIn.nextInt();
			major=getIn.next();
			
			Student tea=new Student(sid,name,sex,age,major);
			
			filet.WriteFile(tea);
			
		}
		getIn.close();
		Student[] te=new Student[100];
		int count=filet.readfile(te);
		for(int i=0;i<count;i++) {
			te[i].display();
		}
	}
}
