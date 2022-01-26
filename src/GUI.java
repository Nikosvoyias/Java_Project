import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame{
	
	private JPanel panel;
	private JTextField selectFleetField;
	private JButton autonomyButton;
	private JButton fileButton;
	private ArrayList<Fleet> fleets;
	
	
	public GUI (ArrayList<Fleet> someFleet) {
		
		fleets = someFleet;
		
		panel = new JPanel();
		selectFleetField = new JTextField("Select Fleet");
		autonomyButton = new JButton("Autonomy");
		fileButton = new JButton("File");
		
		panel.add(selectFleetField);
		panel.add(autonomyButton);
		panel.add(fileButton);
		
		
		this.setContentPane(panel);
		
		ButtonListener listener = new ButtonListener();
		autonomyButton.addActionListener(listener);
		fileButton.addActionListener(listener);
		
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("MyFleet");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener {			

		@Override
		public void actionPerformed(ActionEvent e) {			
			
			String selectedFleetName = selectFleetField.getText();	
			Fleet selectedFleet = null;
			for(Fleet f: fleets)
				if(f.getCityName().equals(selectedFleetName)) {
					selectedFleet = f;
					break;
				}
			
			if(e.getSource().equals(autonomyButton)) {				
				System.out.println("Fleet City Name: " + selectedFleet.getCityName());
				System.out.println("Number of taxis: " + selectedFleet.taxis.size());
				System.out.println("Total Fleet Autonomy for " +selectedFleet.getCityName() + " : " +selectedFleet.calcFleetAutonomy() );	
				
			}
			else {				
				
				try {
					File f = new File("VogiatzisNikolaos.txt");
					FileWriter writer = new FileWriter(f);
					
					writer.write(selectedFleet.getCityName());
					writer.write(System.lineSeparator());
					for(Taxi t: selectedFleet.taxis)
						writer.write(t.toString());
						
					
					writer.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
		}
		
	}

}
