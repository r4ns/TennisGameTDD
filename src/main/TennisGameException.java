package main;

public class TennisGameException extends Exception 
{
	
	String message;
	public TennisGameException() {
		super();
	}
	
	TennisGameException(String message){
		super(message);
		//System.out.println(message);
	}

	public String getMessage() {
		return message;
	}

}

