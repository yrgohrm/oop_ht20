public interface InputControl {
    int getValue();

    default int doubleValue() {
        return getValue() * 2;
    }
}
