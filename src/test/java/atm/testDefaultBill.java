package atm;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDefaultBill {

    @Test
    public void testGetBill(){
        Bill20 bill20 = new Bill20();
        assertEquals(bill20.getBILL(), 20);
    }

    @Test
    public void testGetNextBill(){
        Bill10 bill10 = new Bill10();
        Bill5 bill5 = new Bill5();
        bill10.setNext(bill5);
        assertEquals(bill10.getNextBill(), bill5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFalseProcess(){
        Bill10 bill10 = new Bill10();
        bill10.process(19);
    }

}
