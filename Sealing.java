
public class Sealing {
	private boolean lights;
	private boolean fan;
	private String smokeDetector;
	public Sealing(boolean lights, boolean fan, String smokeDetector) {
		super();
		this.lights = lights;
		this.fan = fan;
		this.smokeDetector = smokeDetector;
	}
	private void isLightsOn(){
		if(lights){
			System.out.println("light is turned on");
		} else {
			System.out.println("please turn on the switch");
		}
	}
	private void isFanOn(){
		if(fan){
			System.out.println("fan is turned on");
		} else {
			System.out.println("please turn on the switch");
		}
	}
	private void isDetectorWorking(String state){
	this.smokeDetector = state;
	if(smokeDetector.equals("green")){
		System.out.println("smoke detector is working");
	} else {
		System.out.println("smoke detector is not working");
	}
}
	public void sealingState(String sealingstate){
		isLightsOn();
		isFanOn();
		isDetectorWorking(sealingstate);
	}
}
