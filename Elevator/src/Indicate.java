
public class Indicate {
	IndicateStatus in;

	public IndicateStatus getIn() {
		return in;
	}
	
	public void setIn(IndicateStatus in) {
		this.in = in;
}
	public void GOINGUP() {
		// TODO Auto-generated method stub
		setIn(IndicateStatus.GOINGUP);
		in=getIn();
		System.out.println("STATUS : "+in);
	}
	public void GOINGDOWN() {
		// TODO Auto-generated method stub
		setIn(IndicateStatus.GOINGDOWN);
		in=getIn();
		System.out.println("STATUS : "+in);
	}

}
