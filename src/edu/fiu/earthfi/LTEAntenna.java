package edu.fiu.earthfi;

import java.util.ArrayList;
import java.util.List;

public class LTEAntenna {

	private String type;
	private Double frequency;
	private Double bandwidth;
	private LTECellTowerMain cellTowerMain;
	private List<PropagatingDevice> devices;
	
	public LTEAntenna() {
		devices = new ArrayList<PropagatingDevice>();
		devices.add(new Balloon());
		devices.add(new Buoy());
	}


	public void sendSignal()  {
		System.out.println("1. LTEAntenna - Signal Sent");
		devices.get(0).receiveSignalFromGround();
	}

	public void systemcCheck()  {
	}

}
