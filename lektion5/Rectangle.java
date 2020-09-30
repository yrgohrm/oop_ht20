/**
 * This is a class representing a Rectangle with a size and a color.
 */
public class Rectangle {
    private double height;
    private double width;
    private int color;

    /**
     * Prints the rectangle in a nice way.
     * 
     */
    public void print() {
        System.out.println("Rectangle:");
        System.out.printf("\theight: %.2f\n", height);
        System.out.printf("\twidth:  %.2f\n", width);
        //System.out.printf("\tcolor:  %s\n", getColor());
    }

    /**
     * Set the height of the rectangle. All values are ok.
     * 
     * @param height the height in mm
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Set the color of the rect. You use common names such as "red" or "grey" to set it.
     * 
     * @param color an english name for a color
     * @return the color as and rgb integer
     */
    public int setColor(String color) {
        if ("red".equals(color)) {
            this.color = 0x00ff0000;
        }
        this.color = 0x00cccccc;
        return this.color;
    }

}
