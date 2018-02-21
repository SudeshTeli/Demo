import java.awt.*;
import java.awt.event.*;

public class example1 extends Frame implements ActionListener {
	TextField tf1;
	example1(){
		
	tf1=new TextField();
	tf1.setBounds(60, 50,150, 50);
	Button b=new Button("BUtton working okie??");
	b.setBounds(100,100,200,40);
	b.setBackground(new Color(10,1,40));
	
	
	b.addActionListener(this);
	
	add(b);
	add(tf1);
	setSize(600,600);
	setLayout(null);
	setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
		tf1.setText("Welcome");
		
	}
	
}
