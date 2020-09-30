public class Windy {
    private int id, hour, min;
    private double temp, windspeed, winddir;
    public static final double ALLDIRECTIONS = 360;
    private static final String[] WD = { "NNE", "NE", "ENE", "E", "ESE", "SE", "SSE", "S", "SSW", "SW", "WSW", "W",
            "WNW", "NW", "NNW", "N"};
    public static final double PIECE = ALLDIRECTIONS / WD.length; //45 degrees
    public static final double HALFPIECE = PIECE/2; //11.25 degrees
    private static final String ERR = "ERROR";

    public String getWinddir() {
        double i = HALFPIECE; //min 11.25
        for (int j = 0; i < (ALLDIRECTIONS + HALFPIECE); i += PIECE, j++) { //max 371.2_4999_9999_9999
            if (winddir >= i && winddir < i + PIECE) {
                return WD[j];
            }
        }
        return ERR; //will never happen
    }

    public String getWinddir2() {
        double rotatedDir = winddir - HALFPIECE;
        int index = (int)(rotatedDir / PIECE);
        return WD[index];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(double windspeed) {
        this.windspeed = windspeed;
    }

    public void setWinddir(double winddir) {
        this.winddir= winddir % ALLDIRECTIONS; // direction -360 exclusive to 360 exclusive
        System.out.println(this.winddir);
        if (this.winddir < HALFPIECE) {
            this.winddir += ALLDIRECTIONS; // direction 11.25 inclusive to 371.2_4999_9999_9999 inclusive
        }
    }

    public static void main(String[] args) {
        Windy b = new Windy();

        for (double i = -359; i < -320; i += 10) {
            b.setWinddir(i);
            String dir = b.getWinddir();
            String dir2 = b.getWinddir2();
            //if (!dir.equals(dir2)) {
                System.out.println(i + " " + dir + " = " + dir2);
            //}
        }
    }
}
