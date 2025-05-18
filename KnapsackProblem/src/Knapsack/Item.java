package Knapsack;

public class Item {
private double object;
private double profit;
private double weight;
public double getObject() {
	return object;
}
public void setObject(int object) {
	this.object = object;
}
public double getProfit() {
	return profit;
}
public void setProfit(int profit) {
	this.profit = profit;
}
public double getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
@Override
public String toString() {
	return "Item [object=" + object + ", profit=" + profit + ", weight=" + weight + "]";
}
}
