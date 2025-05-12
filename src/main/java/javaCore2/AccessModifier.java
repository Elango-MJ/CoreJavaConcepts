package javaCore2;

public class AccessModifier {
	
	//public,private,protected,default
	
	//default : Access method/variable anywhere only inside the package
	int x=0; 
	void abd() {
		
	}
	//public : Access method/variable across all the the package
	public int i=0;
	public void effg() {
		
	}
	
	//private : can't access method/variable outside the of the class
	private int j=0;
	private void hfk() {
		
	}
	//protected : Access method/variable anywhere only inside the package + Sub(Child) class of other packages
	protected int k=0;
	protected void jnkl() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
