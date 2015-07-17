
public class Student {
	private String name;
	private int age;
	
	Student(String name,int age){
		this.name  = name;
		this.age = age;
	}
	
	void display(){
		System.out.println("Name of the student : "+this.name+"\n"
				+ "Age of the student : "+this.age);
	}
}
