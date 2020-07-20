package experiment;

import java.util.Scanner;

public class AddElectivecourse {
	public static void main(String[] args) {
		String elid,sid,classid;
		Myfile filet=new Myfile("testElectivecourse.txt");
		System.out.println("enter Electivecourse info");
		Scanner getIn = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			
			elid=getIn.next();
			sid=getIn.next();
			classid=getIn.next();
			Electivecourse tea=new Electivecourse(elid,sid,classid);
			filet.WriteFile(tea);
			
		}
		getIn.close();
		Electivecourse[] te=new Electivecourse[100];
		int count=filet.readfile(te);
		for(int i=0;i<count;i++) {
			te[i].display();
		}
	}
}
