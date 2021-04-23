package edu.fiu.earthfi;

import java.util.ArrayList;
import java.util.List;

public abstract class PropagatingDevice {

	private Double weight;
	private String size;
	private String color;
	private String material;
	
	private Envelope envelope;
	private Internet internet;
	private Payload payload;
	private GroundControlStation controlStation = new GroundControlStation();
	private Bus bus;
	private Transponder transponder = new Transponder();
	
	private List<PropagatingDevice> nearbyDevices;
	private List<User> systemUsers = new ArrayList<User>();
	
	public PropagatingDevice() {
		nearbyDevices = new ArrayList<PropagatingDevice>();
		systemUsers.add(new User());
		systemUsers.add(new User());
	}

	public void activate()  {
	}

	public void connectToGround()  {
	}

	public void getTelemetryStatus()  {
	}

	public void sendSignalToGround()  {
		System.out.println("2.5 PropagatingDevice - Signal established");
		controlStation.receiveSignalFromDevice();
		System.out.println("2.7 PropagatingDevice - Data acknowledged");		
		systemUsers.get(0).connectToInternet();
		System.out.println("2.9 PropagatingDevice - Internet accessed");
	}

	public void receiveSignalFromGround()  {
		System.out.println("1.1 PropagatingDevice - Signal Received");
	}

	public void moveToPosition()  {
		System.out.println("2.1 PropagatingDevice - Area clear for launch");
	}

	public void systemCheck()  {
	}

	public void getNearbyDevices()  {
		nearbyDevices.add(new Balloon());
		nearbyDevices.add(new Buoy());
	}

	public void propagateSignal()  {
		getNearbyDevices();
		System.out.println("2.3 PropagatingDevice - Signal is good");
		transponder.transferSignal(nearbyDevices.get(0));		
	}

	public void registerPropagatingDevice()  {
	}

	public void unregisterPropagatingDevice()  {
	}

	public void propagateDevicePowerOn()  {
	}

	public void propagateDevicePowerOff()  {
	}
	
	public abstract void decommission();
	
	public abstract String getType();

}
