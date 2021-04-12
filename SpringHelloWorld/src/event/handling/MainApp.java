package event.handling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = 
		         new ClassPathXmlApplicationContext("EventHandlingBeans.xml");

		      // Let us raise a start event.
		      context.start();
			  
		      EventHandlerEx obj = (EventHandlerEx) context.getBean("helloWorld");
		      obj.getMessage();

		      // Let us raise a stop event.
		      context.stop();
		      
	}

}
