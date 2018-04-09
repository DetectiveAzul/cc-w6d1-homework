public class Printer {
    private int paperLeft;
    private int tonerVolume;

    public Printer(int paperLeft, int tonerVolume) {
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperLeft() {
        return paperLeft;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void print(int pages, int copies) {
        double totalCopies = Calculator.multiply(pages, copies);
        if (this.enoughPaper(totalCopies) && (this.enoughToner(totalCopies)) ) {
            this.paperLeft -= totalCopies;
            this.tonerVolume -= totalCopies;
        }
    }

    private boolean enoughPaper(double totalCopies) {
        return this.paperLeft >= totalCopies;
    }

    private boolean enoughToner(double totalCopies) {
        return this.tonerVolume >= totalCopies;
    }

    public void refillPaper(int amount) {
        this.paperLeft += amount;
    }

}
