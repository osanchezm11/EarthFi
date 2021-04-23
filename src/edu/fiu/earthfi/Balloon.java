package edu.fiu.earthfi;

public class Balloon extends PropagatingDevice {

	private Object windSensor;
	private Parachute parachute = new Parachute();

	public void detectWind()  {
	}
	
	public void decommission() {
		parachute.deployParachute();
	}

	public String getType() {
		return "Balloon";
	}

}
