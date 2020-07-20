package experiment;

import java.io.Serializable;

public class Schedule implements Serializable{
	private String cid,classid,tid,classroom;
	public Schedule(String cid,String classid,String tid,String classroom) {
		this.cid=cid;
		this.classid=classid;
		this.tid=tid;
		this.classroom=classroom;
	}
	String getcid() {
		return this.cid;
	}
	String gettid() {
		return this.tid;
	}
	String getclassid() {
		return this.classid;
	}
	String getclassroom() {
		return this.classroom;
	}
	void setcid(String a) {
		this.cid=a;
	}
	void settid(String a) {
		this.tid=a;
	}
	void setclassid(String a) {
		this.classid=a;
	}
	void setclassroom(String a) {
		this.classroom=a;
	}
	void display() {
		System.out.println(this.cid+" "+this.classid+ " "+this.tid+" "+this.classroom);
	}
}
