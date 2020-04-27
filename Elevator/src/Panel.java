
public class Panel {
	PanelStatus ps;

	public PanelStatus getPs() {
		return ps;
	}

	public void setPs(PanelStatus ps) {
		this.ps = ps;
	}

	public void RUNNING() {
		// TODO Auto-generated method stub
		setPs(PanelStatus.RUNNING);
		ps=getPs();
		System.out.println("ELEVATOR STATUS: "+ps);
	}
		public void STOP() {
			// TODO Auto-generated method stub
			setPs(PanelStatus.STOP);
			ps=getPs();
			System.out.println("ELEVATOR STATUS: "+ps);

		
	}	
}
