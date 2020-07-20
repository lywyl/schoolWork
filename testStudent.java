package experiment;

public class testStudent {
	public static void main(String[] args) {
		Student b=new Student("1234","liux","male",18,"computer");
		b.display();
		b.setmajor("software_eng");
		String m;
		m=b.getmajor();
		System.out.println(m);
	}
}
