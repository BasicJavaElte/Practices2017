import models.Calculation;
import models.Unary;
import models.Binary;
import models.AverageArray;
import models.Factor;
import models.MinimalMultiple;
public class CoolCalculator{


  public static void main (String args[]){
    double n1=4;
    double n2=2;
    try{
        Factor f = new Factor();
        f.setNumber(5);
        f.calculate();
        System.out.println( " factor " + " " +f.getResult());
        n1 = f.getResult();
        f.setNumber(3);
        f.calculate();
        n2 = f.getResult();
    }catch(Exception e){
      System.out.println("Something went wrong with the factoring");
    }

    try{
        MinimalMultiple mm = new MinimalMultiple();
        mm.setNumbers(n1,n2);
        mm.calculate();
        System.out.println("The minimal multuple of "+n1+" and "+n2+" is "+mm.getResult());
        System.out.println("Isn't "+mm.getResult()+" a cool number?");
    }catch(Exception e){
      System.out.println("Something went wrong with the Minimal multiple thing");
    }



  }
}
