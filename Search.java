package experiment;

import java.util.Scanner;

public class Search {
	//��ѡ�γ̵����ơ���ʦ���Ͽεص�
	public static void main(String[] args) {
		System.out.println("input the sid to search:");
		String sid,tname,cid,classid1,classroom,cname,tid;
		Scanner getIn = new Scanner(System.in);
		sid = getIn.next();
		Myfile filecou=new Myfile("testCourse.txt");
		Myfile filetea=new Myfile("testTeacher.txt");
		Myfile fileele=new Myfile("testElectivecourse.txt");
		Myfile filesch=new Myfile("testSchedule.txt");
		//��ȡѡ�Σ�ƥ��ѧ����ѧ��sid���ҵ�classid
		Electivecourse[] searchele=new Electivecourse[100];
		int count=fileele.readfile(searchele);
		//��ȡ��ʦ������tid�ҵ���name��
		Teacher[] seartea=new Teacher[100];
		filetea.readfile(seartea);
		//��ȡschedule������classid�ҵ�cid��tid����classroom��
		Schedule[] searsch=new Schedule[100];
		filesch.readfile(searsch);
		//��ȡcourse������cid�ҵ���cname��
		Course[] searcou=new Course[100];
		filecou.readfile(searcou);
		//�ҵ�sid����classid
		int i,truth=0,a;
		for(a=0;a<count;a++) {
			if((searchele[a].getsid()).equalsIgnoreCase(sid)) {
				//classid1=searchele[i].getclassid();
				classid1=searchele[a].getclassid();
				truth=1;
				//����classid�ҵ�cid��tid��classroom
				for(i=0;i<count;i++) {
					if( (searsch[i].getclassid()).equalsIgnoreCase(classid1)){
						break;
					}
						
				}
				//?
				cid=searsch[i].getcid();
				tid=searsch[i].gettid();
				classroom=searsch[i].getclassroom();
				//����cid�ҵ�cname
				for(i=0;i<count;i++) {
					if( (searcou[i].getcid()).equalsIgnoreCase(cid)){
						break;
					}
						
				}
				cname=searcou[i].getcname();
				//����tid�ҵ�tname
				for(i=0;i<count;i++) {
					if( (seartea[i].gettid()).equalsIgnoreCase(tid)){
						break;
					}
						
				}
				tname=seartea[i].getname();
				
				
				System.out.println("lesson:"+ cname+"  teacher "+tname+"  room: "+classroom);
				//break;
			}
				
		}
		if(truth==0) {
			System.out.println("No lesson for him");
			System.exit(1);
		}
		/*classid1=searchele[i].getclassid();
		//����classid�ҵ�cid��tid��classroom
		for(i=0;i<count;i++) {
			if( (searsch[i].getclassid()).equalsIgnoreCase(classid1)){
				break;
			}
				
		}
		cid=searsch[i].getcid();
		tid=searsch[i].gettid();
		classroom=searsch[i].getclassroom();
		//����cid�ҵ�cname
		for(i=0;i<count;i++) {
			if( (searcou[i].getcid()).equalsIgnoreCase(cid)){
				break;
			}
				
		}
		cname=searcou[i].getcname();
		//����tid�ҵ�tname
		for(i=0;i<count;i++) {
			if( (seartea[i].gettid()).equalsIgnoreCase(tid)){
				break;
			}
				
		}
		tname=seartea[i].getname();
		
		
		System.out.println("lesson:"+ cname+"  teacher "+tname+"  room: "+classroom);
		*/
	}

	
}
