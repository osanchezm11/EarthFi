package edu.fiu.earthfi;

import java.util.ArrayList;
import java.util.List;

public class TrafficController {

	private Object location;
	private List<PropagatingDevice> devices;
	
	public TrafficController() {
		devices = new ArrayList<PropagatingDevice>();
		devices.add(new Balloon());
		devices.add(new Buoy());
	}
	
	public void organizeTraffic()  {
		System.out.println("2. TrafficController - Air Traffic for baloon launch");
		devices.get(0).moveToPosition();
		
		System.out.println("2.2 TrafficController - Signal boosted");
		devices.get(0).propagateSignal();
		
	}
	
	public List<PropagatingDevice> getDevices() {
		return devices;
	}

	public void preventCollision()  {
	}

	public void decommissionAll() {		
		for (PropagatingDevice device : devices) {
			System.out.println("3 TrafficController - Decomm signal, device type: " + device.getType());					
			device.decommission();
		}	
	}

}
