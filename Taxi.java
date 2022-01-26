
public abstract class Taxi {
	
	protected String regNumber;
	protected String driverName;
	
	public Taxi(String regNumber, String driverName) {
		this.regNumber = regNumber;
		this.driverName = driverName;
	}
	
	public abstract double calcAutonomy();
	
	public String toString() {
		return ("Registration Number: " + regNumber + " Driver's Name: " + driverName + " Taxi Autonomy: " + this.calcAutonomy() + "\n");
	}
	

}
