package juego;


@SuppressWarnings("serial")
public class InvalidValueException extends Exception {

	private String[] mensajes;
	
	public void addMensajeError(String m) {
		
	}
	
	public String[] getMensajes() {
		return this.mensajes;
	}
	
	
  public InvalidValueException() {
	  mensajes = new String[10];
  }

  public InvalidValueException(String message) {
    super(message);
  }

  public InvalidValueException(Throwable cause) {
    super(cause);
  }

  public InvalidValueException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
