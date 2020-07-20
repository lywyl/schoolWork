package experiment;
import java.util.Scanner;
public class Finalwrite {
	public static void main(String[] args) {
		
		int choose;
		System.out.println("enter the command"
				+ "(number 数字1为查询，2-6分别为添加teacher，student，cou,elective,sche)");
		Scanner getIn = new Scanner(System.in);
		
		choose=getIn.nextInt();
		//getIn.close();
		switch(choose) {
		case 1:Search.main(args);break;
		case 2:AddTeacher.main(args);break;
		case 3:AddStudent.main(args);break;
		case 4:AddCourse.main(args);break;
		case 5:AddElectivecourse.main(args);break;
		case 6:AddSchedule.main(args);break;
		}
		
	}
}
