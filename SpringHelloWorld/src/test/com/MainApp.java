package test.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	    System.out.println( obj.getMessage() );
		
	    System.out.println("=========================================");
	    
	    HelloSpace helloSpace = (HelloSpace) context.getBean("helloSpace");
	    System.out.println( helloSpace.getSpaceMessage() );
	    System.out.println( helloSpace.getHelloWorld().getMessage() );
	    
	    System.out.println("=========================================");
	    
	    
	    HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
	    System.out.println( helloIndia.getMessageIndia() );
	    System.out.println( helloIndia.getMessage() );
	    
	    context.registerShutdownHook();
	    
	}

}
