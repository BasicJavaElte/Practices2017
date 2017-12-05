package models;
public class AverageArray implements Calculation
{
	private double[] arr;
	private double res;
	public void setArray(double[] arr){
		this.arr = arr;
	}
	
	@Override
	public void calculate()
	{
		
		int m=0;
		for(int i=0;i<arr.length;i++)
		{
			m+=arr[i];
		}
		res=m/arr.length;
	}
	
	@Override
	public double getResult()
	{
		return res;
	}
	
}

