package camisasWebjuanpabloochoa.crudpracticedinamycsquerys.exceptions;

public class ExceptionShirtNotFound extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public ExceptionShirtNotFound() {
		super ();
	}
	
	public ExceptionShirtNotFound(String message, Throwable cause) {
        super(message, cause);
    }
	
	public ExceptionShirtNotFound(String message) {
		super(message);
	}
}
