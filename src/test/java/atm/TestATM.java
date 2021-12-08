package atm;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestATM {

    @Test
    public void testGetBill(){
        ATM atm = new ATM();
        int expected = 20;
        int actual = atm.bill.getBILL();
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFalseProcess(){
        ATM atm = new ATM();
        atm.process(12);
    }


}
