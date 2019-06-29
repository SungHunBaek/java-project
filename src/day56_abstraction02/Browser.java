package day56_abstraction02;

public abstract class Browser {
	String id;
	String name;
	public Browser() {
		System.out.println("Creating a browser");
	}
	public abstract void navigate(String url);
	public abstract void displayWebpage();
	public abstract boolean launch();
	
	public void close() {
		System.out.println("Exiting the browser");
	}
}
