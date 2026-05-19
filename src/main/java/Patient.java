import java.util.Random;

//import java.util.Random;
public class Patient {
    private String illness;
    private double day_to_rest;
    private double day_used;
    private String state;
    private double day_left;

    public Patient(){
//        Random random = new Random();
//        String[] illnesses = {"influenza","cold","headache","fever"};
//        String[] states = {"bad","normal","good"};
//        setIllness(illnesses[random.nextInt(illnesses.length)]);
//        setState(states[random.nextInt(states.length)]);
//        setDay_to_rest(random.nextDouble(60));
//        setDay_used(random.nextDouble(60));
//        setDay_left(1);
    }

    public Patient(String illness, double day_to_rest, String state, double day_used, double day_left) {
        super();
        setIllness(illness);
        setDay_to_rest(day_to_rest);
        setState(state);
        setDay_used(day_used);
        setDay_left(day_left);
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        if (illness != null)
        this.illness = illness;
    }

    public double getDay_to_rest() {
        return day_to_rest;
    }

    public void setDay_to_rest(double day_to_rest) {
        if (day_to_rest > 0)
        this.day_to_rest = day_to_rest;
    }

    public double getDay_used() {
        return day_used;
    }

    public void setDay_used(double day_used) {
        if (day_used > 0)
        this.day_used = day_used;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state != null)
        this.state = state;
    }

    public double getDay_left() {
        return day_left;
    }

    public void setDay_left(double day_left) {
        if (day_left > 0){
            this.day_left = day_to_rest - day_used;
        }
    }

    @Override
    public String toString() {
        String str = "illness: " + this.illness + " day_to_rest: " + this.day_to_rest + " day_used: " + this.day_used + " day_left: " + this.day_left + " state: " + this.state;
        return str;
    }
}
