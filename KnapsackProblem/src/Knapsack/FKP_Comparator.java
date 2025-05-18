package Knapsack;
import java.util.Comparator;


public class FKP_Comparator implements Comparator<Item>
{
	
@Override 
  public  int compare(Item p1,Item p2)
   {
	
	double cpr1,cpr2;
	cpr1= new Double(p1.getProfit()/p1.getWeight());
	cpr2=new Double(p2.getProfit()/p2.getWeight());
	if(cpr1<cpr2)
		return 1;
	
	else
	return -1;
	
    }
   }

