package experiment;

import java.util.Scanner;

public class AddCourse {
	public static void main(String[] args) {
		String cid,cname;
		int chour;
		Myfile filet=new Myfile("testCourse.txt");
		System.out.println("enter Course info");
		Scanner getIn = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			
			cid=getIn.next();
			
			cname=getIn.next();
			chour=getIn.nextInt();
			Course tea=new Course(cid,cname,chour);
			
			filet.WriteFile(tea);
			
		}
		getIn.close();
		Course[] te=new Course[100];
		int count=filet.readfile(te);
		for(int i=0;i<count;i++) {
			te[i].display();
		}
	}
}
