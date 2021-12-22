public class Main {
    public static void main(String[] args){
        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2016));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(12, 2021));
    }

}
