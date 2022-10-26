package thetestingacademy.oops.constructors;

public class BasicConstructor {

    public static void main(String[] args) {
            DateData dateData = new DateData();
            dateData.printDate();
    }
}

class DateData {
    int day,month, year;


    DateData(){
        day = 25;
        month = 8;
        year = 2022;
    }

    public void printDate(){
        System.out.println("Date is "+day+month+year);
    }

}
