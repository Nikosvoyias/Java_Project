public class ElectricalTaxi extends Taxi {
	
	private int batteriesNumber;

	public ElectricalTaxi(String regNumber, String driverName, int batteriesNumber) {
		super(regNumber, driverName);
		this.batteriesNumber = batteriesNumber;
	}
	
	public double calcAutonomy() {
		return (75.0 * batteriesNumber);
	}

}
