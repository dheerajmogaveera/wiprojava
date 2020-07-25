class Fruit{
    String name,taste;
    double size;
    void eat()
    {
        
    }
}
class Apple extends Fruit{

    public void setName(String name) {
        this.name = name;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    public String getName() {
        return name;
    }

    public String getTaste() {
        return taste;
    }

    public double getSize() {
        return size;
    }

    @Override
    void eat()
    {   Apple apple=new Apple();
        apple.setName("Apple");
        apple.setTaste("Sweet");
        apple.setSize(7.5);
        System.out.println(apple.getName()+" is a Fruit and are generally "+apple.getSize()+" cms in size and tastes "+apple.getTaste());
    }
    
}
class Orange extends Fruit{

    public void setName(String name) {
        this.name = name;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    public String getName() {
        return name;
    }

    public String getTaste() {
        return taste;
    }

    public double getSize() {
        return size;
    }

    @Override
    void eat()
    {   Orange orange=new Orange();
        orange.setName("Orange");
        orange.setTaste("Sour");
        orange.setSize(7.0);
        System.out.println(orange.getName()+" is a Fruit and are generally "+orange.getSize()+" cms in size and tastes "+orange.getTaste());
    }
    
}
class Exercise1{
public static void main(String args[])
{
  
Apple apple=new Apple();
Orange orange=new Orange();
apple.eat();
orange.eat();


}
}
