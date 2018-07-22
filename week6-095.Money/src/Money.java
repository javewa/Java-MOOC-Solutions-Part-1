
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        return new Money(euros + added.euros, cents + added.cents);
    }
    
    public boolean less(Money compared) {
        boolean c = false;
        if (euros * 100 + cents < compared.euros * 100 + compared.cents) {
            c = true;
        } 
        return c;
    }
    
    public Money minus(Money decremented) {
        Money result = new Money(0,0);
        if (!this.less(decremented)) {
            //result = new Money(euros - decremented.euros, cents - decremented.cents);
            int totalCents = euros*100 + cents;
            int totalDecCents = decremented.euros*100 + decremented.cents;
            int differenceInCents = totalCents - totalDecCents;
            result = new Money(differenceInCents/100, differenceInCents%100);
        }
        return result;
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    

}
