
public class GasolineTaxi extends Taxi {
	
	private int gasTank;
	private double consumption;
	
	public GasolineTaxi(String regNumber, String driverName, int gasTank, double consumption) {
		super(regNumber, driverName);
		this.gasTank = gasTank;
		this.consumption = consumption;
	}
	
	public double calcAutonomy() {
		return (100 * gasTank/ consumption);
	}
	
	
	

}
