
public class MCard {
	static int Total;
	static int Used;
	
	
	public MCard(int total, int used) {
		// TODO Auto-generated constructor stub
		MCard.Total=total;
		MCard.Used=used;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public void setUsed(int used) {
		Used = Used+used;
	}
	public static int getTotal() {
		return Total;
	}
	public int getUsed() {
		return Used;
	}
	
	
}
