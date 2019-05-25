package replit;

public class UtopianTree {
	public static void main(String[] args) {
		int size = 0;
		for(int i = 1; i <= 10; i++) {
			if(i>=1 && i<=3) {
				size += 1;
				System.out.println("year "+i+" - growth 1 cm tree size: "+size+"cm");
			}else if(i>=4 && i<=10) {
				size += 2;
				System.out.println("year "+i+" - growth 2 cm tree size: "+size+"cm");
			}
		}
	}
}
