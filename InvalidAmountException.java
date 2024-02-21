package exceptions;

public class InvalidAmountException extends Exception{
	private String msg;
	public InvalidAmountException(String msg){
		msg="invalid amount";
	}
	public String getmessage() {
		return msg;
	}

}
