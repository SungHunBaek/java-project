package day62_exceptions01;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedVSUnChecked {
	public static void main(String[] args) throws InterruptedException {
		//checked exception - InterruptedException
		//Handle-or-declare
		try {
			System.out.println("Handled");
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("Thread is interrupted.");
		}
		System.out.println("Woke up");
		
		try {
			URL url = new URL("https://google.com");
			System.out.println(url.toString());
		} catch (MalformedURLException e) {
			System.out.println("Invalid URL");
		}
		
	}
}
