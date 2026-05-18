public class Consoles {
    private String Firm;
    private String ConName;
    private int Year;
    private int Month;
    private int Day;
    private int Price;


    public Consoles(String firm, String conName, int year, int month, int day, int price) {
        super();
        this.Firm = firm;
        this.ConName = conName;
        this.Year = year;
        this.Month = month;
        this.Day = day;
        this.Price = price;
    }

    public Consoles(){

    }

    public String getConsole() {
        return Firm;
    }

    public void setConsole(String console) {
        if (Firm != null)
        this.Firm = console;
    }

    public String getConName() {
        return ConName;
    }

    public void setConName(String conName) {
        if (ConName != null)
        this.ConName = conName;
    }

    public int getYear() {

        return Year;
    }

    public void setYear(int year) {
        if(Year > 0)
        this.Year = year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        if(Month > 0)
        this.Month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        if(Day > 0)
        this.Day = day;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        if(Price > 0)
        this.Price = price;
    }

    @Override
    public String toString() {
        String str = "Firm: " + this.Firm + " ConName: " + this.ConName + " Year: " + this.Year + " Month: " + this.Month + " Day: " + this.Day + " Price: " + this.Price;
        return str;
    }
}
