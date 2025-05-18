package Knapsack;

import java.util.ArrayList;
import java.util.Collections;

public class FKP_Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Item> item = new ArrayList<Item>();
    
    Item It1 =new Item ();
    It1.setObject(2);
    It1.setProfit(5);
    It1.setWeight(1);
    
    Item It2 =new Item ();
    It2.setObject(1);
    It2.setProfit(12);
    It2.setWeight(3);
    
    Item It3 =new Item ();
    It3.setObject(3); 
    It3.setProfit(16);
    It3.setWeight(4);
    
    Item It4 =new Item ();
    It4.setObject(4);
    It4.setProfit(7);
    It4.setWeight(2);
    
    Item It5=new Item ();
    It5.setObject(6);
    It5.setProfit(11);
    It5.setWeight(4);
    
    Item It6 =new Item ();
    It6.setObject(7);
    It6.setProfit(6);
    It6.setWeight(3);
    
    Item It7 =new Item ();
    It7.setObject(5);
    It7.setProfit(9);
    It7.setWeight(9);
   
    item.add(It1);
    item.add(It2);
    item.add(It3);
    item.add(It4);
    item.add(It5);
    item.add(It6);
    item.add(It7);
    
    Collections.sort(item,new FKP_Comparator());
    
    for (Item it : item) {
        System.out.println("Object: " + it.getObject() + ", Profit: " + it.getProfit() + ", Weight: " + it.getWeight());
    }
	
	
	
	double  capacity = 15; 
    double maxProfit = 0; 

    for (Item it : item) {
        if (capacity == 0) break; 

        if (it.getWeight() <= capacity) {
            
            maxProfit += it.getProfit();
            capacity -= it.getWeight();
        } else {
            
            double fraction = (double) capacity / it.getWeight();
            maxProfit += it.getProfit() * fraction;
            capacity = 0; 
        }
    }

    System.out.println("Maximum Profit for 15 kg Capacity: " + maxProfit);
    
}
}
