package test.constructor.based.DI;

public class SpellChecker {
	   
	private String message;
	
   public SpellChecker(){
      System.out.println("Inside SpellChecker Constructor. " );
   }
   
   
   public void checkSpelling() {
      System.out.println("Inside checkSpelling. " + message);
   }
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	   
}
