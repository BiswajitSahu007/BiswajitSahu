package customexceptionpropagation;//unchecked execption


public class DayLimitException extends RuntimeException {
	String message;

	public DayLimitException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.getMessage();
	}

	
}
