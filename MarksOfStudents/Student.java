
public class Student{
	String name;
	int physic;
	int chemistry;
	int math;
	double average;
	Student(){
		this.name="unnamed";
		this.physic=this.chemistry=this.math=0;
		this.average=0;
	}
	Student(String name,int physic,int chemistry,int math){
		this.name=name;
		this.physic=physic;
		this.chemistry=chemistry;
		this.math=math;
		this.average=(this.physic+this.chemistry+this.math)/3;
	}
}