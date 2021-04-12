package test.com;

public class HelloSpace {

	private String spaceMessage;
	private HelloWorld helloWorld;
	
	
	public String getSpaceMessage() {
		return spaceMessage;
	}

	public void setSpaceMessage(String spaceMessage) {
		this.spaceMessage = spaceMessage;
	}

	public HelloWorld getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}
	

	public void init() {
		System.out.println("I am in init");
	}
	
	public void destroy() {
		System.out.println("I am in destroy");
	}
	
	
}
