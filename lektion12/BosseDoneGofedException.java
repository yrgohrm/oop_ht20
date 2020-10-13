public class BosseDoneGofedException extends Exception {
    private static final long serialVersionUID = 8015502770288682858L;

    public BosseDoneGofedException() {
    }

    public BosseDoneGofedException(String message) {
        super(message);
    }

    public BosseDoneGofedException(String message, Throwable cause) {
        super(message, cause);
    }

    public BosseDoneGofedException(Throwable cause) {
        super(cause);
    }
}
