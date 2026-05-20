//import java.util.Random;



public class Sport extends Personin {
    private String sportname;
    private String status;
    private double years_in;

    public Sport(){
//        Random rand = new Random();
//        String [] sports = {"Football","Box","Golf","Swimming","Basketball"};
//        String [] statuses = {"pro","amateur","beginer"};
//        this.sportname = sports[rand.nextInt(sports.length)];
//        this.status = statuses[rand.nextInt(statuses.length)];
//        this.years_in = rand.nextDouble(20);
    }

    public Sport(String sportname, String status, double years_in) {
        super();
        this.sportname = sportname;
        this.status = status;
        this.years_in = years_in;
    }

    public String getSportname() {
        return sportname;
    }

    public void setSportname(String sportname) {
        if (sportname != null)
        this.sportname = sportname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status != null)
        this.status = status;
    }

    public double getYears_in() {
        return years_in;
    }

    public void setYears_in(double years_in) {
        if (years_in > 0)
        this.years_in = years_in;
    }

    @Override
    public String toString() {
        String str = " Sportname: " + this.sportname + "Status: " + this.status + "Years in: " + this.years_in;
        return str;
    }
}
