class Calculator {
     static int powerInt(int num1,int num2 )
     {
         return (int)Math.pow(num1, num2);
     }
     static double powerDouble(double num1,double num2)
     {
         return Math.pow(num1, num2);
     }
}
class Exercise2
{
    public static void main(String[] args) {
        
        System.out.println(Calculator.powerInt(4, 5));
        System.out.println(Calculator.powerDouble(3.5, 4));
        
        
        
    }
}
