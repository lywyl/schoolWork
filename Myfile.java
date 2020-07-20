package experiment;
import java.io.*;
public class Myfile{
	File opfile;
	File getfile() {
		return opfile;
	}
	Myfile(String name) {
		this.opfile=new File(name);
	}
	
	public int readfile(Person[] per) {
		int count=0;
	try {
			FileInputStream in = new FileInputStream(this.opfile);
					if(in.available()!=0) {
					ObjectInputStream obj = new ObjectInputStream(in);
					for(Person c_in; (c_in = (Person) obj.readObject())!=null;) {
						per[count++]=c_in;
					}
					
				  		obj.close();
					}
				   else{
				       System.out.println("file blank!");
				        
				  }

		}catch(Exception e) {
			//System.out.println(e);
		}
	return count;
	}
 public int readfile(Student[] s) {
		int count=0;
	try {
			FileInputStream in = new FileInputStream(this.opfile);
					if(in.available()!=0) {
					ObjectInputStream obj = new ObjectInputStream(in);
				 	//Object s_in=null;
				 	
					//s_in = obj.readObject();
						for(Student s_in; (s_in = (Student) obj.readObject())!=null;) {
							s[count++]=s_in;
						}
					}
				   else{
				       System.out.println("file blank!");
				        
				  }

		}catch(Exception e) {
			//System.out.println(e);
		}
	return count;
	}
 public int readfile(Teacher[] t) {
		int count=0;
	try {
			FileInputStream in = new FileInputStream(this.opfile);
					if(in.available()!=0) {
					ObjectInputStream obj = new ObjectInputStream(in);
//Object s_in=null;
				 	
					//s_in = obj.readObject();
					
					for(Teacher c_in; (c_in = (Teacher) obj.readObject())!=null;) {
						t[count++]=c_in;
					}
					
				  		obj.close();
					}
				   else{
				       System.out.println("file blank!");
				        
				  }

		}catch(Exception e) {
			//System.out.println(e);
		}
	return count;
	}
 public int readfile(Course[] c) {
		int count=0;
	try {
			FileInputStream in = new FileInputStream(this.opfile);
					if(in.available()!=0) {
					ObjectInputStream obj = new ObjectInputStream(in);
				 	Object s_in=null;
				 	//Object s_in=null;
				 	
					//s_in = obj.readObject();
					
					for(Course c_in; (c_in = (Course) obj.readObject())!=null;) {
						c[count++]=c_in;
					}
					
				  		obj.close();
					}
				   else{
				       System.out.println("file blank!");
				        
				  }

		}catch(Exception e) {
			//System.out.println(e);
		}
	return count;
	}
 public int readfile(Schedule[] sch) {
		int count=0;
	try {
			FileInputStream in = new FileInputStream(this.opfile);
					if(in.available()!=0) {
					ObjectInputStream obj = new ObjectInputStream(in);
				 	Object s_in=null;
				 	//Object s_in=null;
				 	
					//s_in = obj.readObject();
					
					for(Schedule c_in; (c_in = (Schedule) obj.readObject())!=null;) {
						sch[count++]=c_in;
					}
					
				  		obj.close();
					}
				   else{
				       System.out.println("file blank!");
				        
				  }

		}catch(Exception e) {
			//System.out.println(e);
		}
	return count;
	}
 public int readfile(Electivecourse[] ele) {
		int count=0;
	try {
			FileInputStream in = new FileInputStream(this.opfile);
					if(in.available()!=0) {
					ObjectInputStream obj = new ObjectInputStream(in);
				 	//Object s_in=null;
				 	
					//s_in = obj.readObject();
					
					for(Electivecourse s_in; (s_in = (Electivecourse) obj.readObject())!=null;) {
						ele[count++]=s_in;
					}
					
				  		obj.close();
					}
				   else{
				       System.out.println("file blank!");
				        
				  }

		}catch(Exception e) {
			//System.out.println(e);
		}
	return count;
	}
	
	void WriteFile(Person p) {
		boolean isexist = false;
		try {
			if (this.opfile.exists()) {
				isexist = true;
				FileOutputStream out = new FileOutputStream(this.opfile, true);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				long pos = 0;
				if (isexist) {
					pos = out.getChannel().position() - 4;
					out.getChannel().truncate(pos);
				}
				fin.writeObject(p);
			} else {
				FileOutputStream out = new FileOutputStream(this.opfile);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				fin.writeObject(p);
				fin.close();
				System.out.println("success!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	void WriteFile(Student stu) {
		boolean isexist = false;
		try {
			if (this.opfile.exists()) {
				isexist = true;
				FileOutputStream out = new FileOutputStream(this.opfile, true);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				long pos = 0;
				if (isexist) {
					pos = out.getChannel().position() - 4;
					out.getChannel().truncate(pos);
				}
				fin.writeObject(stu);
				//System.out.println("1");
			} else {
				FileOutputStream out = new FileOutputStream(this.opfile);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				fin.writeObject(stu);
				fin.close();
				System.out.println("success!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	void WriteFile(Teacher tea) {
		boolean isexist = false;
		try {
			if (this.opfile.exists()) {
				isexist = true;
				FileOutputStream out = new FileOutputStream(this.opfile, true);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				long pos = 0;
				if (isexist) {
					pos = out.getChannel().position() - 4;
					out.getChannel().truncate(pos);
				}
				fin.writeObject(tea);
				//System.out.println("1");
			} else {
				FileOutputStream out = new FileOutputStream(this.opfile);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				fin.writeObject(tea);
				fin.close();
				System.out.println("success!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//课程和person的参数顺序不一样，这里为str，int，str。
	void WriteFile(Course cour) {
		boolean isexist = false;
		try {
			if (this.opfile.exists()) {
				isexist = true;
				FileOutputStream out = new FileOutputStream(this.opfile, true);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				long pos = 0;
				if (isexist) {
					pos = out.getChannel().position() - 4;
					out.getChannel().truncate(pos);
				}
				fin.writeObject(cour);
				//System.out.println("1");
			} else {
				FileOutputStream out = new FileOutputStream(this.opfile);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				fin.writeObject(cour);
				fin.close();
				System.out.println("success!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	void WriteFile(Electivecourse elec) {
		boolean isexist = false;
		try {
			if (this.opfile.exists()) {
				isexist = true;
				FileOutputStream out = new FileOutputStream(this.opfile, true);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				long pos = 0;
				if (isexist) {
					pos = out.getChannel().position() - 4;
					out.getChannel().truncate(pos);
				}
				fin.writeObject(elec);
				//System.out.println("1");
			} else {
				FileOutputStream out = new FileOutputStream(this.opfile);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				fin.writeObject(elec);
				fin.close();
				System.out.println("success!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	void WriteFile(Schedule sche) {
		boolean isexist = false;
		try {
			if (this.opfile.exists()) {
				isexist = true;
				FileOutputStream out = new FileOutputStream(this.opfile, true);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				long pos = 0;
				if (isexist) {
					pos = out.getChannel().position() - 4;
					out.getChannel().truncate(pos);
				}
				fin.writeObject(sche);
				//System.out.println("1");
			} else {
				FileOutputStream out = new FileOutputStream(this.opfile);
				ObjectOutputStream fin = new ObjectOutputStream(out);
				fin.writeObject(sche);
				fin.close();
				System.out.println("success!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
