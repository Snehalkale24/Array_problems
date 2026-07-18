public class student
{
	private String id;
	private String name;
	private String sub[]=new String[5];
	private int marks[]=new int[5];

	public student(int id, String name, String sub[],int marks[])
	{
		this.id=id;
		this.name=name;
		this.sub=sub;
		this.marks=marks;
	}

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String[] getSub(){
		return sub;
	}
	public int[] getMarks(){
		return marks;
	}

	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSub(String sub[]){
		this.sub=sub;
	}
	public void setMarks(int marks[])
	{
		this.marks=marks;
	}


	public void studentInfo(){
		System.out.println("student details");
		System.out.println("--------------------");
		System.out.println("id"+id);
		System.out.println("name"+name);


		for(int i=0;i<sub.length;i++){
			System.out.println(sub[i]+ " :"+ marks[i]);
		}
	}
}