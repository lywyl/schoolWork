package experiment;

public class testTeacher {
	public static void main(String[] args) {
		Teacher thr=new Teacher("333444","docter","chenzheng","male",30);
		thr.display();
		thr.settitle("scholar");
		String c=thr.gettitle();
		System.out.println(c);
	}
}
