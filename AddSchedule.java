package experiment;

import java.util.Scanner;

public class AddSchedule {
	public static void main(String[] args) {
		String cid,classid,tid,classroom;
		Myfile filet=new Myfile("testSchedule.txt");
		System.out.println("enter Schedule info");
		Scanner getIn = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			
			cid=getIn.next();
			
			classid=getIn.next();
			tid=getIn.next();
			classroom=getIn.next();
			Schedule tea=new Schedule(cid,classid,tid,classroom);
			
			filet.WriteFile(tea);
			
		}
		getIn.close();
		Schedule[] te=new Schedule[100];
		int count=filet.readfile(te);
		for(int i=0;i<count;i++) {
			te[i].display();
		}
	}
}
