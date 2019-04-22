class Person {
	
	// Instance variables
	String name;
	int age;
	
	//methods of the class
	
	void speak() {
		System.out.println("My Name is : "+ name + " Age is : " + age );
	}
	
	void sayHello() {
		System.out.println("Hello " + name);
	}
	
	int calculateyears_to_retrire()
	{
		int yearsleft=65 - age;
		return yearsleft;
	}
}

public class class_object_example {

	public static void main(String[] args) {
		
		Person a1=new Person();
		a1.name="Mahesh";
		a1.age=28;
		a1.speak();
		a1.sayHello();
		int years=a1.calculateyears_to_retrire();
		System.out.println("Years left for retire is " + years);
		
		
		Person a2=new Person();
		a2.name="Eclipse";
		a2.age=33;
		a2.speak();
		a2.sayHello();
		years=a2.calculateyears_to_retrire();
		System.out.println("Years left for retire is " + years);

	}

}
