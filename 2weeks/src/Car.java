
public class Car implements Valuable {
	private String name;
	private double price;
	public Car(String name, double price){
		this.name= name;
		this.price=price*0.8;
	}
	@Override
	public double EstimateValue(int month) {
		this.price= this.price * month *0.99;
		// TODO Auto-generated method stub
		return price;
	}
	public String toString(){
		return String.format("car name : %s\ninitial price : %f",name,price);
	}
	
}
