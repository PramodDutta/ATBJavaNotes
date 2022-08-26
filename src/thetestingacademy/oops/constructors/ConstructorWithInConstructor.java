package thetestingacademy.oops.constructors;

public class ConstructorWithInConstructor {

    public static void main(String[] args) {
        DateDemoC2C dateDemoC2C = new DateDemoC2C(3,3,4);
        System.out.println(dateDemoC2C.toString());
    }


}

class DateDemoC2C{
    int day;
    int currentMonth;
    int currentYear;

    DateDemoC2C(int currentMonth,int currentYear) {
        this.currentMonth = currentMonth;
        this.currentYear = currentYear;
    }

    DateDemoC2C(int cm,int cy,int day){
        this(cm,cy);
        this.day = day;
    }

    public String toString(){
        return day+" - "+currentMonth+" - "+currentYear+"";
    }


}
