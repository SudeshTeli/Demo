
public class StopButton {
	StopButtonStatus sb;

	public StopButtonStatus getSb() {
		return sb;
	}

	public void setSb(StopButtonStatus sb) {
		this.sb = sb;
	}
	public void ON() {
		// TODO Auto-generated method stub
		setSb(StopButtonStatus.ON);
		sb=getSb();
		System.out.println("STOP BUTTON: "+sb);
	}
	public void OFF() {
		// TODO Auto-generated method stub
		setSb(StopButtonStatus.OFF);
		sb=getSb();
		System.out.println("STOP BUTTON: "+sb);
	}
	
}
