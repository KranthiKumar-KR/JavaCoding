
public class Windows {
	private int noOfPanes;
	private int noOfBlinds;
	private String itemName;
	private boolean isClean;
	public Windows(int noOfPanes, int noOfBlinds) {
		super();
		this.noOfPanes = noOfPanes;
		this.noOfBlinds = noOfBlinds;
	}
	
	private void isClosed(String name){
		this.itemName = name;
		switch(itemName){
		case "panes":
			System.out.println("window panes are closed");
			break;
		case "blinds":
			System.out.println("blinds are closed");
			break;
			default:
				System.out.println("please check the item you wanna check");
				break;
		}
	}
	private void isCleaned(boolean clean){
		this.isClean = clean;
		if(clean){
			System.out.println("windows are cleaned");
		} else {
			System.out.println("windows are not cleaned");
		}
	}
	public void windowState(String name, boolean clean){
		isClosed(name);
		isCleaned(clean);
	}
}
