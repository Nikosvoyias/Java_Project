import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Fleet f1 = new Fleet("Thessaloniki");
		Fleet f2 = new Fleet("Athens");
		
		ElectricalTaxi et1 = new ElectricalTaxi("NZN4554", "VogiatzisNikolaos", 100);
		ElectricalTaxi et2 = new ElectricalTaxi("IEK1357", "AyrtonSenna", 500);
		
		GasolineTaxi gt1 = new GasolineTaxi("KIA4012", "Alonso", 50, 130.0);
		GasolineTaxi gt2 = new GasolineTaxi("NIE6969", "Lauda", 100, 111.0);
		
		f1.addTaxi(et1);
		f1.addTaxi(gt1);
		
		f2.addTaxi(et2);
		f2.addTaxi(gt2);
		
		ArrayList<Fleet> fleets = new ArrayList<>();
		
		fleets.add(f1);
		fleets.add(f2);
		
		new GUI(fleets);

	}

}
