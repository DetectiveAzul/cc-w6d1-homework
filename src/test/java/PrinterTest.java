import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer00;
    private Printer printer01;

    @Before
    public void before() {
        printer00 = new Printer(15, 100);
        printer01 = new Printer(40, 100);
    }

    @Test
    public void printEnoughPaper() {
        printer01.print(10,2);
        assertEquals(20, printer01.getPaperLeft());
    }

    @Test
    public void printNotEnoughPaper() {
        printer00.print(10,2);
        assertEquals(15, printer00.getPaperLeft());
    }

    @Test
    public void canRefill() {
        printer01.print(10,2);
        printer01.refillPaper(20);
        assertEquals(40, printer01.getPaperLeft());
    }
    @Test
    public void tonerIsBeingEmptied() {
        printer01.print(10,2);
        assertEquals(80, printer01.getTonerVolume());
    }
    @Test
    public void tonerCanBeRefilled() {
        printer01.print(10,2);
        printer01.refillToner(20);
        assertEquals(100,printer01.getTonerVolume());
    }
}
