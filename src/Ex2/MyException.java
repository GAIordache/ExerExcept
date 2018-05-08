package Ex2;

public class MyException extends Exception{
	private String mMyString;
	
	public MyException(String pMyString) {
		super(pMyString);
		mMyString = pMyString;
		
	}

}
