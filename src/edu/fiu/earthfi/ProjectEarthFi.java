package edu.fiu.earthfi;

public class ProjectEarthFi {

	public static void main(String[] args) {
		new ProjectEarthFi().deviceBasicFlow();	
	}

	private void deviceBasicFlow() {
		System.out.println("Starting the basic device flow");
		
		LTEAntenna antenna = new LTEAntenna();		
		antenna.sendSignal();
		
		TrafficController controller = new TrafficController();
		controller.organizeTraffic();
		
		controller.decommissionAll();
		
	}

}
