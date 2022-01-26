import java.util.ArrayList;

public class Fleet {
	
	private String cityName;
	ArrayList<Taxi> taxis = new ArrayList<>();
	
	public Fleet(String cityName) {
		this.cityName = cityName;
	}	
	
	public void addTaxi(Taxi aTaxi) {
		taxis.add(aTaxi);		
	}

	public String getCityName() {
		return cityName;
	}
	
	public double calcFleetAutonomy() {
		
		double sum = 0;
		
		for(Taxi t: taxis)
			sum += t.calcAutonomy();		
		return sum;
	}

}
