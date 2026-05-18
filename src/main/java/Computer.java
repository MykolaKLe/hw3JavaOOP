public class Computer {
    private String Company;
    private String CPU;
    private int RAM;
    private int SSD;


    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        if(Company != null)
        this.Company = Company;
    }

    public String getCPU() {

        return CPU;
    }

    public void setCPU(String CPU) {
        if (CPU != null)
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        if (RAM > 0)
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        if (SSD > 0)
        this.SSD = SSD;
    }

    public Computer(String Company, String CPU, int RAM, int SSD) {
        super();
        this.Company = Company;
        this.CPU = CPU;
        this.RAM = RAM;
        this.SSD = SSD;

    }

    @Override
    public String toString() {
        String str = "Company: "+ this.Company +" CPU: "+ this.CPU +" RAM:"+ this.RAM +" SSD:"+ this.SSD;
        return str;
    }
}
/*
HW
1.

Computer
company(string)
ram(int)
CPU(String)
SDD(int)
setter/getter

MainComputer -> main
create 3 object Computer
Use setters and getters for printing

1.      Computer
        _________

        company(String) "Lenovo"
        ram(int).        8 or 16
        cpu(String).     i5 or i9
        sdd(int).        500 Gb
        set/get

        MainComputer -> main
//        create 3 objects Computer
//        use setters and getters for printing
//2. Advance
for your choose
 */