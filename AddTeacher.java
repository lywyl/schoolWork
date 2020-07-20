package experiment;

import java.util.Scanner;

public class AddTeacher {
	public static void main(String[] args) {
		String tid,name,sex,title;
		int age;
		Myfile filet=new Myfile("testTeacher.txt");
		System.out.println("enter teacher info");
		Scanner getIn = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			
			tid=getIn.next();
			title=getIn.next();
			name=getIn.next();
			sex=getIn.next();
			age=getIn.nextInt();
			
			
			Teacher tea=new Teacher(tid,title,name,sex,age);
			
			filet.WriteFile(tea);
			
		}
		getIn.close();
		Teacher[] te=new Teacher[100];
		int count=filet.readfile(te);
		for(int i=0;i<count;i++) {
			te[i].display();
		}
	}
}
