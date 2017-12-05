package models;
public class Factor extends Unary implements Calculation {
	
	public Factor()
	{
		this.result=1;
	}
	
	@Override
	public void calculate()
	{
		for(double i=1;i<=this.num;i++){
			this.result*=i;
		}
	}
	
	@Override
	public double getResult()
	{
		return result;
	}
}
