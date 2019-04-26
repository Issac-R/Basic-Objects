public class RoadBike extends Bike{
	private int gears;
	private double weight;
	
	public RoadBike(){}

	public RoadBike(int X, String B){
		String[] A = ((B).split(","));
		String temp = "";
		for(int i = 0; i<A.length; i++){
			temp = A[i];
			temp = temp.trim();
			A[i] = temp;
		}
		super.setType(A[0]);
		super.setModel(A[1]);
		super.setColor(A[2]);
		super.setTotal(Integer.parseInt(A[3]));
	}
	
	public RoadBike(String B){
		String[] A = ((B).split(","));
		String temp = "";
		for(int i = 0; i<A.length; i++){
			temp = A[i];
			temp = temp.trim();
			temp = temp.replaceAll("\\$","");
			A[i] = temp;
		}

		super.setType(A[0]);
		super.setModel(A[1]);
		super.setBoughtPrice(Integer.parseInt(A[2]));
		super.setSellPrice(Integer.parseInt(A[3]));
		super.setColor(A[4]);
		super.setTotal(Integer.parseInt(A[5]));
		super.setAgeRange(A[6]);
		this.gears = Integer.parseInt(A[7]);
		this.weight = Double.parseDouble(A[8]);
	}
	
	//Setters 
	public void setGears(int A){
		this.gears = A;
	}
	public void setWeight(double A){
		this.weight = A;
	}
	
	//Getters 
	public int getGears(){
		return gears;
	}
	public double getWeights(){
		return weight;
	}

	public String toString(){
		String  result = super.toString();
		System.out.println("Weight: " + weight);
		System.out.println("Number of Gears: " + gears);
		return result;
	}
}