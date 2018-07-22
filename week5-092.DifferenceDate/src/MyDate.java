public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        int difference = 0;
        int actual = 0;
        if (comparedDate.year < year) {
            difference = ((day - comparedDate.day) + (month - comparedDate.month) *12 + (year - comparedDate.year)*365);
            actual = difference/365;
        } else {
            difference = ((comparedDate.day - day) + (comparedDate.month - month) * 12 + (comparedDate.year - year) * 365);
            actual = difference/365;
        }
        
        return actual;
    }

}
