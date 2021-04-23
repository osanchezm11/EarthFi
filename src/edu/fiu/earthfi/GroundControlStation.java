package edu.fiu.earthfi;

import java.util.List;

public class GroundControlStation {

	private Object receptionAntenna;
	private Object receiver;
	private Object feedHorn;
	private Object waveguide;
	private Object radome;
	private LTEAntenna antenna;
	private GroundRecoveryTeam groundRecoveryTeam;
	private List<PropagatingDevice> devices;	

	public void getConnectionStatus()  {
	}

	public void powerOn()  {
	}

	public void getSignalFromTower()  {
	}

	public void receiveSignalFromTower()  {
	}

	public void issueCommand() {
	}

	public void monitorActivity()  {
	}

	public void receiveSignalFromDevice() {
		System.out.println("2.6 GroundControlStation - Signal Directed");		
	}

}
