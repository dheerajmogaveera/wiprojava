
abstract class Compartment{
    public abstract String notice();
}
class FirstClass extends Compartment{

    @Override
    public String notice() {
        return "First class Compartment(I)";
    }
    
}
class Ladies extends Compartment{

    @Override
    public String notice() {
        return "Ladies Compartment";
    }
    
}
class General extends Compartment{

    @Override
    public String notice() {
        return "General Compartment (II)";
    }
    
}
class Luggage extends Compartment{

    @Override
    public String notice() {
        return "Luggage Compartment";
    }
    
}
class TestCompartment{
    public static void main(String[] args) {
        Compartment c[]=new Compartment[10];
        for(int i=0;i<10;i++)
        {
            int r=(int)Math.ceil(Math.random()*4);
            switch(r)
            {
                case 1:
                    c[i]=new FirstClass();
                    break;
                case 2:
                    c[i]=new Ladies();
                    break;
                case 3:
                    c[i]=new General();
                    break;
                case 4:
                    c[i]=new Luggage();
                    break;
                default:
                    break;
            }
        }
       
        for (Compartment c1 : c) {
            System.out.print(c1.notice() + " ");
        }
    }
}