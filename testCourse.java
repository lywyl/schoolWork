package experiment;

public class testCourse {
	public static void main(String[] args) {
		String c;
		Course cou=new Course("aaaaa1","java",64);
		cou.display();
		cou.setcname("c language");
		c=cou.getcname();
		System.out.println(c);
}
}
