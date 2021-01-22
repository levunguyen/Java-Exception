package Session_13_Exception;

public class AgeCheckingException extends Exception {
    public AgeCheckingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vào một tuổi: " + super.getMessage();
    }
}
