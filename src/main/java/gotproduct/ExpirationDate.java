package gotproduct;

public class ExpirationDate {
    private String month;
    private String day;
    private String year;

    @Override
    public String toString() {
        return "ExpirationDate{" +
                "month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public ExpirationDate(String month, String day, String year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
}
