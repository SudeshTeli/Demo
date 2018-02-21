
public class Indicator {
	IndicatorStatus is;
	
	public IndicatorStatus getIs() {
		return is;
	}
	
	public void setIs(IndicatorStatus is) {
		this.is = is;
	}
	public void ON() {
		// TODO Auto-generated method stub
		setIs(IndicatorStatus.ON);
		is=getIs();
		System.out.println("INDICATOR LIGHT: "+is);
	}
	public void OFF() {
		// TODO Auto-generated method stub
		setIs(IndicatorStatus.OFF);
		is=getIs();
		System.out.println("INDICATOR LIGHT: "+is);
	}

}
