package exception;

public class WrongPassordException extends Exception {

  public WrongPassordException() {
    super();
  }

  public WrongPassordException(String message) {
    super(message);
  }
}
