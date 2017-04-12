
public  class Human implements Valuable {
	private String name;
	private int age;
	
	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public double EstimateValue(int month) {
		// TODO Auto-generated method stub
		return Double.POSITIVE_INFINITY;
	}
	public String toString(){
		return String.format("Human name : %s\nregistered age : %d",name,age );
	}
}
