package totalservice.utilities;

public class ValidationException  extends Exception{
	private String pattern;

	public String getPattern() {
		return pattern;
	}

	public ValidationException(String inPattern)
	{
		this.pattern = inPattern;
	}
	
}
