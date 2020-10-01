import java.util.logging.Logger;

public class MathStuff {
    private static Logger logger = Logger.getLogger(MathStuff.class.getName());

    public static void doStuff() {
        logger.info("här händer det grejer");
    }

    public void doOtherStuff() {
        logger.warning("ojojoj");
        doStuff();
    }
}
