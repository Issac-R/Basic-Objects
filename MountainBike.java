public class MountainBike extends Bike{
	private String riderLevel; 
	private int wheelSize;
	
	public MountainBike(){}

	public MountainBike(int X, String B){
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
	
	public MountainBike(String B){
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
		this.riderLevel = A[7];
		this.wheelSize = (Integer.parseInt(A[8]));
	}
	
	
	//Setters
	public void setWheelSize(int A){
		this.wheelSize = A;
	}
	public void setRiderLevel(String A){
		this.riderLevel = A;
	}
	
	//Getters
	public double getWheelSize(){
		return wheelSize;
	}
	public String getRiderLevel(){
		return riderLevel;
	}
	
	public String toString(){
		String  result = super.toString();
		System.out.println("Rider Level: " + riderLevel);
		System.out.println("Wheel Size: " + wheelSize);
		return result;
	}
}