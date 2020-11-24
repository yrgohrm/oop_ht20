public abstract class Shape {
    private int posX;
    private int posY;

    public Shape() {
        this.posX = 99;
        this.posY = 55;
    }

    public Shape(int posX, int posY) {
        if (posX < 0 || posX > 1000) {
            throw new IllegalArgumentException("nix det går inte");
        }

        if (posY < 0 || posY > 1000) {
            throw new IllegalArgumentException("nix det går inte");
        }

        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        if (posX < 0 || posX > 1000) {
            throw new IllegalArgumentException("nix det går inte");
        }

        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        if (posY < 0 || posY > 1000) {
            throw new IllegalArgumentException("nix det går inte");
        }

        doit();

        this.posY = posY;
    }

    public abstract int area();

    public abstract void draw();

    private int doit() {
        return 0;
    }

    public int doits() {
        return 0;
    }
}
