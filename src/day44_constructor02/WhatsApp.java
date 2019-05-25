package day44_constructor02;

public class WhatsApp {
	private String toNumber;
	private String message;
	private boolean delivered;
	
	public WhatsApp() {
		
		System.out.println("No-Args constructor" );
	}
	public WhatsApp(String toNumber,String message) {
		this();
		System.out.println("2-Args constructor");
		this.message = message;
		this.toNumber = toNumber;
	}
	public WhatsApp(String tonuString) {
		this();
		System.out.println("1-Arg constructor");
		
	}
	
	
	
	
	
	
	
	
	
	
	public String getToNumber() {
		return toNumber;
	}

	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
}
