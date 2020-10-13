public class PictureNotSquareException extends RuntimeException {
    public static final long serialVersionUID = 1345657364L;

    public PictureNotSquareException() {
    }

    public PictureNotSquareException(String message) {
        super(message);
    }

    public PictureNotSquareException(String message, Throwable cause) {
        super(message, cause);
    }

    public PictureNotSquareException(Throwable cause) {
        super(cause);
    }
}
