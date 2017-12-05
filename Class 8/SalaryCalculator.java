
import models.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SalaryCalculator{


  public static void main (String args[]){
    SimpleDateFormat myFormat= new SimpleDateFormat("yyyyMMdd");
    Date birthday;
    try{
      birthday = myFormat.parse("19900101");
      Driver d = new Driver("Josh",birthday,"PK99324" );
      // d.setGrossSalary(300);
      // d.setAditionalNightHours(40);
      // d.setGottenFines(0);
      System.out.println(d.getDiscounts());
      System.out.println(d.getGrossWage());
    }catch(Exception r){}



  }
}
