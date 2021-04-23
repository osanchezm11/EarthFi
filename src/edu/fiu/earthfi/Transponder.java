package edu.fiu.earthfi;

public class Transponder {

	private String type;
	private Double frequency;

	public void locateDevice()  {
	}

	public void transferSignal(PropagatingDevice propagatingDevice) {
		System.out.println("2.4 Transponder - Signal Transferred");
		propagatingDevice.sendSignalToGround();		
	}

}
