
abstract class Instrument{
    public abstract String play();
}
class Piano extends Instrument{

    @Override
    public String play() {
        return "Piano is playing  tan tan tan tan";
    }
    
}
class Flute extends Instrument{

    @Override
    public String play() {
        return "Flute is playing  toot toot toot toot";
    }
    
}
class Guitar extends Instrument{

    @Override
    public String play() {
        return "Guitar is playing  tin  tin  tin";
    }
    
}

class Exercise3{
    public static void main(String[] args) {
        Instrument c[]=new Instrument[10];
        for(int i=0;i<10;i++)
        {
            int r=(int)Math.ceil(Math.random()*3);
            switch(r)
            {
                case 1:
                    c[i]=new Piano();
                    break;
                case 2:
                    c[i]=new Flute();
                    break;
                case 3:
                    c[i]=new Guitar();
                    break;
                default:
                    break;
            }
        }
       
        for (int i=0;i<c.length;i++) {
            if(c[i] instanceof Piano)
            {
                System.out.println(i+":Piano Class");
            }
            else if(c[i] instanceof Flute)
            {
                System.out.println(i+":Flute Class");
            }
            else
            {
                System.out.println(i+":Guitar Class"); 
            }
            System.out.println(c[i].play());
        }
    }
}