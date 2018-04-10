public class WaterBottle {
    private double volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public void drink() {
        this.volume -= 10;
        if (this.volume <= 0) { this.volume = 0; }
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
