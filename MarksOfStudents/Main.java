import java.lang.Integer;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Main{
	static int numberOfStudent=0;
	private static Student[] readData(String filename){
		Student[] student=new Student[100];
		File file;
		try{
			file=new File("/users/2/a1790432/Desktop/MarksOfClass/"+filename);
			Scanner fileScan=new Scanner(file);
			while(fileScan.hasNextLine()){
				String string=fileScan.nextLine();
				String[] studentInfo=string.split(" ");
				String name=studentInfo[0];
				int physic=Integer.parseInt(studentInfo[1]);
				int chemistry=Integer.parseInt(studentInfo[2]);
				int math=Integer.parseInt(studentInfo[3]);
				student[numberOfStudent]=new Student(name,physic,chemistry,math);
				numberOfStudent++;
			}
			return student;
		}catch(FileNotFoundException e){
			System.out.println("File does not exist!");
		}
		return null;
	}
	public static void sortStudents(Student[] students){
		int n=numberOfStudent;
		for(int i=0;i<n;i++){
			int index=i;
			for(int j=i+1;j<n;j++){
				if(students[j].average<students[index].average){
					index=j;
				}
			}
			Student temp=students[i];
			students[i]=students[index];
			students[index]=temp;
		}
	}
	public static void printStudents(Student[] student){
		String ans=String.format("%10s%10s%10s%10s","Student","AverageScore","physic","chemistry","math");
		for(int i=0;i<numberOfStudent;i++){
			ans+=String.format("%10s%f%10d%10d%10d",student[i].name,student[i].physic,student[i].chemistry,student[i].math);
		}
		// for()
		System.out.println(ans);
	}
	public static void main(String[] args) {
		Student[] student=readData("students.txt");
		sortStudents(student);
		printStudents(student);
	}
}