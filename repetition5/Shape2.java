public class Shape2 {
    private int posX;
    private int posY;

    public Shape2() {
        this.posX = 99;
        this.posY = 55;
    }

    public Shape2(int posX, int posY) {
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

        this.posY = posY;
    }
}
