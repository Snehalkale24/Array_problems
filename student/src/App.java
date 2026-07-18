public class App
{
	public static void main(String args[])
	{
		int marks[]={11,22,33,44,55};
		String  sub[]={"science","math","phy","marathi","java"};
		student s1=new student(11,"snehal",sub,marks);
		s1.studentInfo();
	}
}