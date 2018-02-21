
public class Sim {
	double  MobileNo;
	String ServiceProvider;
	
	public Sim(double  d, String provider) {
		// TODO Auto-generated constructor stub
		this.MobileNo=d;
		this.ServiceProvider=provider;
	}
	
	public double  getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long  mobileNo) {
		MobileNo = mobileNo;
	}
	public String getServiceProvider() {
		return ServiceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		ServiceProvider = serviceProvider;
	}
	
	
	
}
