
public class LED {
	LEDstatus ls;

	public LEDstatus getLs() {
		return ls;
	}

	public void setLs(LEDstatus ls) {
		this.ls = ls;
	}
	public void GROUND() {
		// TODO Auto-generated method stub
		setLs(LEDstatus.GROUND);
		ls=getLs();
		System.out.println("FLOOR : "+ls);
	}
	public void FIRST() {
		// TODO Auto-generated method stub
		setLs(LEDstatus.FIRST);
		ls=getLs();
		System.out.println("FLOOR : "+ls);
	}
	public void SECOND() {
		// TODO Auto-generated method stub
		setLs(LEDstatus.SECOND);
		ls=getLs();
		System.out.println("FLOOR : "+ls);
	}
	public void THIRD() {
		// TODO Auto-generated method stub
		setLs(LEDstatus.THIRD);
		ls=getLs();
		System.out.println("FLOOR : "+ls);
	}
}
