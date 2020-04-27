
public class MobileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Screen screen1=new Screen(5.5);
		Screen screen2=new Screen(6.0);	
		MCard memoryCard1=new MCard(32000,250);
		MCard memoryCard2=new MCard(64000,200);
		Sim sim1=new Sim(98765432,"Idea");
		Sim sim2=new Sim(87957463,"Vodafone");
		Mobile Nokia6=new Mobile("Nokia6",screen1,(float)13.0,(float) 8.0, 50, "Virtua", 12876547, sim1, memoryCard1, sim2);
		Mobile LenovoZ2=new Mobile("LenovoZ2",screen2,(float)16.5,(float) 5.5, 50, "Querty", 12876547, new Sim(86759485,"Hutch"), memoryCard2, new Sim(96816253,"Gio"));
		
		//Turning on LenovoZ2 Phone
		Nokia6.Power();
		if(Nokia6.PowerStatus()==0)
			System.out.println("\nNokia6 Turned ON\n");
		else
			System.out.println("\nNokia6 Turned OFF\n");
		
		//Turning on LenovoZ2 Phone
		LenovoZ2.Power();
		if(LenovoZ2.PowerStatus()==0)
			System.out.println("\nLenovoZ2 Turned ON\n");
		else
			System.out.println("\nLenovoZ2 Turned OFF\n");
		
		
		//Calling LenovoZ2 from Nokia6
		System.out.println("\n\n*********Calling LenovoZ2 from Nokia6*********");
		Nokia6.call( LenovoZ2, 86759485);
		
		//Calling from LenovoZ2
		System.out.println("\n*********Calling Nokia6 from LenovoZ2*********");
		LenovoZ2.call( Nokia6, 98765412);
		
		System.out.println("\n\n*********Clicking Photo with Nokia6 Rear Camera*********");
		Nokia6.RearCamClick();
		System.out.println("\n\n*********Clicking Selfie with LenovoZ2 Front Camera*********");
		LenovoZ2.FrontCamClick();
		
		System.out.println("\n\n*********Mobile Status of Nokia6 *********");
		Nokia6.MobileStatus();	
	
		Nokia6.Power();
		if(Nokia6.PowerStatus()==0)
			System.out.println("\nNokia6 Turned ON\n");
		else
			System.out.println("\nNokia6 Turned OFF\n");
	}
}
