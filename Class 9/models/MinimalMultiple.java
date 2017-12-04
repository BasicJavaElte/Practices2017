package models;
public class MinimalMultiple extends Binary implements Calculation
{
@Override
	public void calculate()
	{
		double min;
		if(n>m){
			min = m;
		}else{
			min = n;
		}
		double i=1;
		while(min!=0){
				min=min%i;
				i++;
		}
		result = i;
	}
	
	@Override
	public double getResult()
	{
		return result;
	}
	
}
