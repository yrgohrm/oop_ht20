public class Rectangle2 {
    private Shape2 shape;
    private int height;
    private int width;

    public Rectangle2(int height, int width) {
        this.shape = new Shape2();
        this.height = height;
        this.width = width;
    }

    public Rectangle2(int height, int width, int posX, int posY) {
        this.shape = new Shape2(posX, posY);
        this.height = height;
        this.width = width;
    }

    public Shape2 getShape() {
        return shape;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHeight(String height) {
        setHeight(Integer.valueOf(height));
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getPosX() {
        return super.getPosX() * 100;
    }

    @Override
    public int area() {
        return height * width;
    }

    @Override
    public void draw() {
        for (int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {
                System.out.print("#");
            }
            System.out.println("");
        }

        doits();
    }

    @Override
    public int doits() {
        return 0;
    }
}
