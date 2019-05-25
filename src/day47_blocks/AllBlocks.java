package day47_blocks;

public class AllBlocks {
	int nonStaticInt = 10;
	static int staticInt = 10;
	static {
		System.out.println("static block - I run first and only once");
		staticInt--;
		
	}
	
	{
		System.out.println("INIT BLOCK - I run each time object is created. Before construction");
		staticInt += 5;
		nonStaticInt +=5;
	}
	
	public AllBlocks() {
		System.out.println("Constructor - I run each time object is created. After init Block");
		nonStaticInt +=3;
		staticInt +=3;
	}
		
}
