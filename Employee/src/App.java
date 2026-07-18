public class App{
	public static void printAllEmployees(Employee empList[])
{
    for(Employee e : empList)
    {
        System.out.println(e.getId());
        System.out.println(e.getFirstName());
        System.out.println(e.getLastName());
        System.out.println(e.getSalary());
    }
}
	public static void main(String[] args) {

		Employee employee1=new Employee(101,"Rahul","Patil",55000);
		Employee employee2=new Employee(102,"Kareena","Kapoor",56000);
		Employee employee3=new Employee(103,"Katrina","Kaif",75000);
		Employee employee4=new Employee(104,"Raveena","Tandon",45000);
		Employee employee5=new Employee(105,"Sakeena","Khan",35000);


		Employee empList[]=new Employee[5];
		empList[0]=employee1;
		empList[1]=employee2;
		empList[2]=employee3;
		empList[3]=employee4;
		empList[4]=employee5;

		 printAllEmployees(empList);
		


	}

}