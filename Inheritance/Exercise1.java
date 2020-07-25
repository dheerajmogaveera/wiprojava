class Animals{
    void eat()
    {
        System.out.println("Animals eat food");
    }
    void sleep()
    {
        System.out.println("All Animals sleep");
    }
 
}
class Birds extends Animals
{
   @Override
   void eat()
   {
       System.out.println("Bird is an animal and it eats food");
   }
   @Override
    void sleep()
    {
        System.out.println("Bird is an animal and all birds sleep");
    }
    void fly()
    {
        System.out.println("Birds can fly");
    }
    
}


class Exercise1 {
    public static void main(String[] args) {
        
       Animals a=new Animals();
       Birds b=new Birds();
       a.eat();
       b.eat();
       a.sleep();
       b.sleep();
       b.fly();
        
        
        
    }
    
}
