
public class RequestButton {
	RequestButtonStatus rb;

	public RequestButtonStatus getRb() {
		return rb;
	}

	public void setRb(RequestButtonStatus rb) {
		this.rb = rb;
	}
	public void UP() {
		// TODO Auto-generated method stub
		setRb(RequestButtonStatus.UP);
		rb=getRb();
		System.out.println("REQUEST BUTTON: "+rb);
	}
	public void DOWN() {
		// TODO Auto-generated method stub
		setRb(RequestButtonStatus.DOWN);
		rb=getRb();
		System.out.println("REQUEST BUTTON: "+rb);
	}
}
