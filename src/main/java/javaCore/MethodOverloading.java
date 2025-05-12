package javaCore;

public class MethodOverloading {
	
	//one class having multiple methods with same name and different arguments.
	//
	
	public void getdata(int a) {
		System.out.println(a);
		
	}
   public void getdata(String a) {
	   System.out.println(a);
		
	}
   public void getdata(int a,int b) {
	   System.out.println(a+" "+b);
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading MOL=new MethodOverloading();
		MOL.getdata(3);
		MOL.getdata("Hello");
		MOL.getdata(5, 9);

	}

}
