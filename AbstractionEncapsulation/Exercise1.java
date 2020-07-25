class Author{
    
    String name,email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    
}
class Book
{
    Author author;
    String name;
    double price;
    int qtyInStock;

    public Book(String name,Author author, double price, int qtyInStock) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
    
    
    
}


class Exercise1 {
    public static void main(String[] args) {
        
        Book b=new Book("Engima",new Author("Robert Harris","rh@gmail.com",'M'),250.45,50);
        System.out.println("BookName      Author      Price       Quantity Available  Author Gender       Author Mail    ");
        System.out.println(b.getName()+"    "+b.getAuthor().name+"      "+b.getPrice()+"      "+b.getQtyInStock()+"                  "+b.getAuthor().gender+"        "+b.getAuthor().email);
        
        
        
        
    }
    
}
