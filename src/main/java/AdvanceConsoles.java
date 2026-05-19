public class AdvanceConsoles {
    public static void main(String[] args) {
        Consoles[] bk = {
                new Consoles("Sony","PlayStation 1",1994 ,12,3, 400),
                new Consoles("Sony", "PlayStation 2", 2000, 3, 4, 300),
                new Consoles("Sony", "PlayStation 3", 2006, 11, 11, 499),
                new Consoles("Sony", "PlayStation 4", 2013, 11, 15, 399),
                new Consoles("Sony", "PlayStation 5", 2020, 11, 12, 699),
                new Consoles("Microsoft", "Xbox", 2001, 11, 15, 299),
                new Consoles("Microsoft", "Xbox 360", 2005, 11, 22, 299),
                new Consoles("Microsoft", "Xbox One", 2013, 11, 22, 499),
                new Consoles("Microsoft", "Xbox Series X", 2020, 11, 10, 799),
                new Consoles("Microsoft", "Xbox Series S", 2020, 11, 10, 499),
                new Consoles("Nintendo", "Wii", 2006, 11, 19, 249),
                new Consoles("Nintendo", "Wii U", 2012, 11, 18, 299),
                new Consoles("Sega", "Master System", 1985, 10, 20, 200),
                new Consoles("Sega", "Mega Drive", 1988, 10, 29, 189),
                new Consoles("Sega", "Sega Saturn", 1994, 11, 22, 399),
                new Consoles("Sega", "Dreamcast", 1998, 11, 27, 199),
                new Consoles("Valve", "Steam Machine", 2015, 11, 10, 449),
                new Consoles("Valve", "Steam Machine BOX", 2026, 6, 10, 649)



        };
        for (Consoles bk1 : bk) {
            System.out.println(bk1);
        }


    }
}
