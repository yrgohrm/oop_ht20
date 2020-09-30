public enum ComplexEnum {
    STUFF(1, 22), THING(2, 1), DOHICKEY(99, 99);

    private int data;
    private int otherData;

    ComplexEnum(int d1, int d2) {
        data = d1;
        otherData = d2;
    }

    public int getData() {
        return data;
    }

    public int getOtherData() {
        return otherData;
    }    
}
