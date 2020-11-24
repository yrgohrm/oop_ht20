public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int height, int width, int posX, int posY) {
        super(posX, posY);
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle r) {
        super(r.getPosX(), r.getPosY());
        this.height = r.height;
        this.width = r.width;
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
