package test.com;

public class HelloIndia {

	private String messageIndia;
	private String message;

	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public String getMessageIndia() {
		return messageIndia;
	}

	public void setMessageIndia(String messageIndia) {
		this.messageIndia = messageIndia;
	}
	
	
	public void init() {
		System.out.println("I am in init");
	}
	
	public void destroy() {
		System.out.println("I am in destroy");
	}
	
}
