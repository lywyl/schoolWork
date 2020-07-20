package experiment;

import java.io.Serializable;

public class Course implements Serializable{
	private String cname,cid;
	 private int chour;
	public Course(String cid,String cname,int chour) {
		this.cid=cid;
		this.cname=cname;
		this.chour=chour;
	}
	String getcid() {
		return this.cid;
	}
	String getcname() {
		return this.cname;
	}
	int getchour() {
		return this.chour;
	}
	void setcid(String id) {
		this.cid=id;
	}
	void setcname(String name) {
		this.cname=name;
	}
	void setchour(int h) {
		this.chour=h;
	}
	void display() {
		System.out.println(this.cid+" "+this.cname+ " "+this.chour);
	}
}
