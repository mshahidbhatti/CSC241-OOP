public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}