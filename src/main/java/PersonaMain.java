public class PersonaMain {
    public static void main(String[] args) {
        Personin bk = new Personin("Max","Dovgan", 453654,21);
        System.out.println(bk);
        Sport bf = new Sport("Football", "begginer", 4.5);
        System.out.println(bf);
        Employee bg = new Employee("Tester", 6.5, 3500, "IT", "master","QA Tester");
        System.out.println(bg);
        Patient bn = new Patient("influenza",36.5,"bad",12.3,1);
        System.out.println(bn);


    }
}

// я хочу все зарандомить и списком сделать поєтому в коменте пишу
// скажите можна так или нет я много закоментил
//Personin[] bk = new Personin[5];
//for(int i = 0; i < bk.length; i++){ bk[i]= new Personin(); }
//System.out.println(bk[i]);
// дальше не пишу для других но подобное будет
