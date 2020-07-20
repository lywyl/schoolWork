package experiment;

public class Student extends Person{
	private String sid;
	private String major;
	public Student(String sid,String name, String sex, int age,String major) {
		super(name, sex, age);
		this.sid=sid;
		this.major=major;
		//this.name=name;
		//this.sex=sex;
		//this.age=age;
	}
	String getsid() {
		return this.sid;
	}
	String getmajor() {
		return this.major;
	}
	void setmajor(String a) {
		this.major=a;
	}
	void setsid(String a) {
		this.sid=a;
	}
	void display() {
		System.out.println(this.sid +" " + this.name +" "+this.major+" "+this.sex+ " "+this.age);
	}
}
