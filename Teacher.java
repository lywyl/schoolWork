package experiment;

public class Teacher extends Person{
	private String tid,title;
	public Teacher(String tid,String title,String name, String sex, int age) {
		super(name, sex, age);
		this.tid=tid;
		this.title=title;
	}
	String gettid() {
		return this.tid;
	}
	String gettitle() {
		return this.title;
	}
	void settid(String a) {
		this.tid=a;
		
	}
	void settitle(String a) {
		this.title=a;
	}
	void display() {
		System.out.println(this.tid +" " +this.title+" "+ this.name +" "+this.sex+ " "+this.age);
	}
}
