package project1;

public class Student{
	private String studentID;
	private String name;
	private int quiz1;
	private int quiz2;
	private int midterm;
	private int finalexam;
	private double avg;
	private String grade;
	
	public Student ()
	{
		// TODO initialize all the private data members (id="na", n="na", quiz1=0, quiz2=0, 
		// midterm=0, finalexam=0, avg=0.0, grade="na") 
		studentID = "na";
		name= "na";
		quiz1 = 0;
		quiz2 = 0;
		midterm = 0;
		finalexam = 0;
		avg = 0;
		grade = "na";
	}
	
	public Student (String id, String n, int q1, int q2, int m, int f)
	{
		studentID = id;
		name= n;
		quiz1 = q1;
		quiz2 = q2;
		midterm = m;
		finalexam = f;
		avg = 0;
		grade = "na";
		
	}
	public Student (String id, String n, int q1, int q2, int m, int f, double a, String letterGrade)
	{

		studentID=id;
		name=n;
		quiz1=q1;
		quiz2=q2;
		midterm=m;
		finalexam=f;
		avg=a;
		grade=letterGrade;
		
	}
	
	public void set(String id, String n, int q1, int q2, int m, int f, double a, String g)
	{
		studentID=id;
		name=n;
		quiz1=q1;
		quiz2=q2;
		midterm=m;
		finalexam=f;
		avg=a;
		grade=g;
		
	}
	
	public void calcAvg()
	{
		avg = ((quiz1*10*0.125) + (quiz2*10*0.125) +( midterm *0.25) + (finalexam *0.5))/4;
	}
	
	public void calcGrade()
	{
		if(avg >= 90) {
			grade = "A";	
		}else if (avg >= 80) {
			grade = "B";	
		}else if (avg >= 70) {
			grade = "C";	
		}else if (avg >= 60) {
			grade = "D";	
		}else {
			grade = "F";
		}
		
	}
	
	public String getID()
	{
		// TODO return studentID
        // Here is an example
		return studentID;
	}
	
	public String getName()
	{
		// TODO return name
		return name;
	}
	
	public int getQuiz1()
	{
		// TODO return quiz1
		return quiz1;
	}
	
	public int getQuiz2()
	{
		// TODO return quiz2
		return quiz2;
	}
	
	public int getMidterm()
	{
		// TODO return midterm
		return midterm;
	}
	
	public int getFinalexam()
	{
		// TODO return finalexam
		return finalexam;
	}
	
	
	public double getAvg()
	{
		calcAvg();
		return avg;
	}
	
	public String getGrade()
	{
		calcGrade();
		return grade;
	}
	
}