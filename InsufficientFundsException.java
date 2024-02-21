package exceptions;

public class InsufficientFundsException extends Exception{
	private String msg;
	
	public InsufficientFundsException(String message){
		
		msg="insufficient balance";
	
	}
   public String getmessage() {
	   return msg;
   }
}
