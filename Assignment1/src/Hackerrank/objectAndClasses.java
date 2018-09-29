package Hackerrank;

public class objectAndClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student mark=new Student();
      mark.setId(1);
      mark.setAge(15);
      mark.setName("Mark");
      System.out.println(mark.getName() + "is" + mark.getAge() + "years old" + "having student id" + mark.getId());
	}

}
public class Student{
	String name;
	int id;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}