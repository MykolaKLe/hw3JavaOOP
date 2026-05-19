public class Lesson_6_MainBooks {
    public static void main(String[] args) {
        Book bk = new Book("Sherlock Holms","Arthur Conan Doyl",759,12345);
        System.out.println(bk.toString());
        FictionBook fb = new FictionBook("Kotor ","Kaiden Sep ", 350 ,45675 ,"Fantasy");
        System.out.println(fb);
        EducationBook eb = new EducationBook("Math", "Pifagor", 500, 4654515, "Geometry");
        System.out.println(eb);
        KidsFictionBook kfb = new KidsFictionBook("Mass Effect", "Dru Karpishen", 650, 56465, "Fantasy", 12);
        System.out.println(kfb);
    }

}
/*
                      Person
                [Name    Id    age]
                 |       |      |
            Employee SportsMan Patient
   [Company, Salary]  [Sport,status]  [idCardInsurance]
          |              |
      SalesEmployee
      [bonus]

 */

