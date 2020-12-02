import java.util.Comparator;

public class Computer implements Comparable<Computer> {
    private String name;
    private double frequency;
    private long ram;
    private long hdd;

    public Computer(String name, double frequency, long ram, long hdd) {
        this.name = name;
        this.frequency = frequency;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getName() {
        return name;
    }

    public double getFrequency() {
        return frequency;
    }

    public long getRam() {
        return ram;
    }

    public long getHdd() {
        return hdd;
    }

    /**
     * Compares according to frequency, ram and hdd in descending order.
     * @param o the object to compare with
     */
    @Override
    public int compareTo(Computer o) {
        var comp = Comparator.comparing(Computer::getFrequency)
                             .thenComparingLong(Computer::getRam)
                             .thenComparingLong(Computer::getHdd)
                             .reversed();

        return comp.compare(this, o);

        /*
        int resFreq = Double.compare(this.frequency, o.frequency);
        if (resFreq == 0) {
            int resRam = Long.compare(this.ram, o.ram);
            if (resRam == 0) {
                int resHdd = Long.compare(this.hdd, o.hdd);
                return -resHdd;
            }
            return -resRam;
        }
        
        return -resFreq;*/
    }

    @Override
    public String toString() {
        return "Computer [frequency=" + frequency + ", ram=" + ram + ", hdd=" + hdd + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(frequency);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + (int) (hdd ^ (hdd >>> 32));
        result = prime * result + (int) (ram ^ (ram >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Computer other = (Computer) obj;
        if (Double.doubleToLongBits(frequency) != Double.doubleToLongBits(other.frequency))
            return false;
        if (hdd != other.hdd)
            return false;
        if (ram != other.ram)
            return false;
        return true;
    }   
}
