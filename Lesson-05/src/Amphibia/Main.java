package Amphibia;

public class Main {
	public static void main(String[] args) {
		Frog f1 = new Frog(20,15);
		System.out.println(f1);
		f1.eat();
		System.out.println("I'm eating moskitos");
		f1.sleep();
		System.out.println("I'm never sleep");
		f1.sweem();
		System.out.println("I'm sweeming on the river");
		f1.walk();
		System.out.println("I'm walking on the shore");
		
	}

}
