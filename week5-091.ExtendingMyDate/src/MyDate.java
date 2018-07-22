
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
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
    
    public void advance() {
        if ((day == 30) && (month != 12)) {
            month += 1;
            day = 1;
        } else if ((month == 12) && (day == 30)) {
            year += 1;
            month = 1;
            day = 1;
        } else {
            day += 1;
        }
    }
    
    public void advance(int numberOfDays) {
        while (numberOfDays > 0) {
            advance();
            numberOfDays -= 1;
        }
    }
    
    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(day, month, year);
        newMyDate.advance(days);
        return newMyDate;
    }

}
