
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers k1=new KidUsers();
        KidUsers k2=new KidUsers();
        AdultUsers a1=new AdultUsers();
        AdultUsers a2=new AdultUsers();
        k1.setAge(10);
        k1.registerAccount();
        k1.setbookType("Kids");
        k1.registerBook();
        k1.setbookType("Horror");
        k1.registerBook();
        k2.setAge(20);
        k2.registerAccount();
        a1.setAge(25);
        a1.registerAccount();
        a1.setbookType("Fiction");
        a1.registerBook();
        a1.setbookType("Fantasy");
        a1.registerBook();
        a2.setAge(8);
        a2.registerAccount();
    }
}
