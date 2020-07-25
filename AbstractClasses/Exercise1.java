
abstract class GeneralBank {
    abstract double getSavingsInterestRate();
    abstract double getFixedDepositInterestRate(); 
}
class ICICIBank extends GeneralBank{

    @Override
    double getSavingsInterestRate() {
      return 4.0;
    }

    @Override
    double getFixedDepositInterestRate() {
        return 8.5;
    }
    
}
class KotMBank extends GeneralBank{

    @Override
    double getSavingsInterestRate() {
        return 6.0;
    }

    @Override
    double getFixedDepositInterestRate() {
        return 9.0;
    }
    
}
class Exercise1{
    public static void main(String[] args) {
      ICICIBank i=new ICICIBank();
      KotMBank k=new KotMBank();

      GeneralBank g=new KotMBank();

      GeneralBank c=new ICICIBank();
      System.out.println(i.getSavingsInterestRate());
      System.out.println(i.getFixedDepositInterestRate());
      System.out.println(k.getSavingsInterestRate());
      System.out.println(k.getFixedDepositInterestRate());
      System.out.println(g.getSavingsInterestRate());
      System.out.println(g.getFixedDepositInterestRate());
      System.out.println(c.getSavingsInterestRate());
      System.out.println(c.getFixedDepositInterestRate());
    }
}