package thetestingacademy.oops.constructors;

public class ThisDemo {

    public static void main(String[] args) {
        DateDataParam dateDataParam = new DateDataParam(10, 04, 1990);
        dateDataParam.printDate();
    }
}


class DateDataParam {
    int day, month, year;


    DateDataParam(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate() {
        System.out.println("Date is " + day + "|" + month + "|"+year);
    }


}
