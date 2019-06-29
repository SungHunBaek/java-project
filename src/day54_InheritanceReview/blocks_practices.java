package day54_InheritanceReview;


public class blocks_practices {
	static String names;
	
	static {
		names="John";
	}
	
	{
		names ="Aaron";
	}
	public blocks_practices() {
		names="Muradil";
	}
	
	
	 int num1=10;
	static int num2=10;
	
	public static void main(String[] args) {
		
		
		blocks_practices obj =new blocks_practices();
					obj.num1 = 20; 
					obj.num2 = 20;
					
					blocks_practices obj2 =new blocks_practices();
			System.out.println(obj2.num1);  // 10
			System.out.println(obj2.num2);  // 20
			System.out.println(names);
	}

}
