package juego;

public class NoPersonajeException extends Exception {

	private static final long serialVersionUID = -7897470531482813920L;

	public NoPersonajeException() {
	}

	public NoPersonajeException(String message) {
		super(message);
	}

	public NoPersonajeException(Throwable cause) {
		super(cause);
	}

	public NoPersonajeException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoPersonajeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
