package lesson08ExceptionsDeepi;

// We are creating a custom exception. In this case, I override the methods of Throwable
public class MyExceptionsDeepi extends Throwable{
	
	@Override
	public String getMessage() { 
		return "Attention, your text is not valid";
	}

}

//getMessage is a method created by somebody which inbuilt in Java. 
// so I am overriding it and creating my own method return, i want for getMessage