package b2;
public class student
{
	private int id;
	private String name;
	private double marks;

	public student(){}
	public student(int id,String name,double marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public void print(){
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("marks"+marks);
	}
}