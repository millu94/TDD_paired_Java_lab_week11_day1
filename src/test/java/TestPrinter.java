import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasPaper(){
        assertEquals(1000, printer.getRemainingSheets());
    }

    @Test
    public void canPrint(){

        assertEquals(true, printer.print(5, 10));
        assertEquals(950, printer.getRemainingSheets());
        assertEquals(950, printer.getTonerVolume());
    }

    @Test
    public void cantPrint(){
        assertEquals(false, printer.print(100, 100));
        assertEquals(1000, printer.getRemainingSheets());
        assertEquals(1000, printer.getTonerVolume());
    }

    @Test
    public void hasToner(){
        assertEquals(1000, printer.getTonerVolume());
    }





}
