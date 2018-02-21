
public class Button {
	ButtonStatus bs;

	public ButtonStatus getBs() {
		return bs;
	}

	public void setBs(ButtonStatus bs) {
		this.bs = bs;
	}

	public void UP() {
		// TODO Auto-generated method stub
		setBs(ButtonStatus.UP);
		bs=getBs();
		System.out.println("UP AND DOWN BUTTON STATUS: "+bs);
	}
	public void DOWN() {
		// TODO Auto-generated method stub
		setBs(ButtonStatus.DOWN);
		bs=getBs();
		System.out.println("UP AND DOWN BUTTON STATUS: "+bs);
	}


}
