
public class KidUsers implements LibraryUser{

    int age;
    String bookType;

    public void setAge(int age) {
        this.age = age;
    }

    public void setbookType(String bookType) {
        this.bookType = bookType;
    }
    
    @Override
    public void registerAccount() {
        if(age==0)
            System.out.println("Sorry age cannot be zero");
        else if(this.age<12)
            System.out.println("You have sucessfully registered under a Kids Account");
        else
            System.out.println("Sorry age must be less than 12 to register as a kid");
    }

    @Override
    public void registerBook() {
        if(this.bookType.equals("Kids"))
            System.out.println("Book issued Sucessfully,please return the book within 10 days");
        else
            System.out.println("Oops,you are allowed to take only kids books");
    }
    
}
