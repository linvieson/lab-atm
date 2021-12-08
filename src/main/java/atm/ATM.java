package atm;

public class ATM {
    public DefaultBill bill;

    public ATM(){
        Bill20 bill20 = new Bill20();
        Bill10 bill10 = new Bill10();
        Bill5 bill5 = new Bill5();

        bill20.setNext(bill10);
        bill10.setNext(bill5);

        this.bill = bill20;
    }

    public void process(int amount){
        bill.process(amount);
    }

}
