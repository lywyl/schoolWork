package experiment;

import java.io.Serializable;

public class Electivecourse implements Serializable{
	private String elid,sid,classid;
	Electivecourse(String elid,String sid,String classid){
		this.elid=elid;
		this.sid=sid;
		this.classid=classid;
	}
	String getelid() {
		return this.elid;
	}
	String getsid() {
		return this.sid;
	}
	String getclassid() {
		return this.classid;
	}
	void setelid(String a) {
		this.elid=a;
	}
	void setsid(String a) {
		this.sid=a;
	}
	void setclassid(String a) {
		this.classid=a;
	}
	void display() {
		System.out.println(this.elid+" "+this.sid+ " "+this.classid);
	}
}
