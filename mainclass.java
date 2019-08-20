package polymorphism;

public final class mainclass {

	public static void main(String[] args) {
		Bmw ob= new Bmw();  //static polymorphism /compile time polymorphism
		System.out.println("child class");
		ob.start();
		ob.stop();
		ob.reverse();
		ob.theftcontrol();
	
	
	System.out.println("parent class");
	car obj=new car();
	obj.start();
	
	System.out.println("dynamic polymorphism"); //dynamic polymorphism or Runtime polymorphism / child object can be reference by parent class reference variable
car obj1=new Bmw();
obj1.start();
obj1.stop();
obj1.reverse();

System.out.println("Downcasting");
Bmw obj3=(Bmw) new car();
obj3.start();


	
}
}