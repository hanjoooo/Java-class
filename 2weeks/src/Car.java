
public class Car implements Valuable {
	private String name;
	private double price;
	public Car(String name, double price){
		this.name= name;
		this.price=price*0.8;
	}
	@Override
	public double EstimateValue(int month) {
		// TODO Auto-generated method stub
		this.price= this.price * month *0.99;
		return price;
	}
	public String toString(){
		return String.format("car name : %s\ninitial price : %f",name,price);
	}
	
}
