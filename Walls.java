
public class Walls {
	 private boolean sWitch1;
	private String mirror;
	private boolean chargingPort;
	public Walls(boolean sWitch1, String mirror, boolean chargingPort) {
		this.sWitch1 = sWitch1;
		this.mirror = mirror;
		this.chargingPort = chargingPort;
	}
	private boolean changeSwitch(boolean sWitch ){
		this.sWitch1 = sWitch;
		if(sWitch){
			System.out.println("Switch turned on");
		}
		return sWitch;
	}
	private void isCharging(boolean ischarging){
		this.chargingPort = ischarging;
		if(chargingPort){
			System.out.println("charging port is working good");
		}
	}
public void wallsState(boolean sWitch2, boolean charging){
	changeSwitch(sWitch2);
	isCharging(charging);
}
}
