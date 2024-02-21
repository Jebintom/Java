package exceptions;

public class StringchangeException extends Exception{
	private String msg;
  public  StringchangeException(){
	  String  msg="invalid format";
   }
   public String getmessage() {
	   return msg;
   }
}
