package javaCore2;

public class ChildClass extends ParentClass {
	
	
	public void data() {
		super.data();
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass CC=new ChildClass();
		CC.data();
		

	}

}
