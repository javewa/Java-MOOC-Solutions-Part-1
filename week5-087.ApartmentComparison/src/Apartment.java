
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        boolean c = false;
        if (this.squareMeters > otherApartment.squareMeters) {
            c = true;
        }
        return c;    
    }
    
    public int priceDifference(Apartment otherApartment) {
        return Math.abs(this.squareMeters * this.pricePerSquareMeter - otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        boolean c = false;
        if (this.squareMeters * this.pricePerSquareMeter > otherApartment.squareMeters * otherApartment.pricePerSquareMeter) {
            c = true;
        }
        return c;
    }
    
}
