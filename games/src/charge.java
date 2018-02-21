import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Stroke;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class charge extends Core implements KeyListener, MouseListener,
		MouseMotionListener{
	
	boolean edeath = false;
	int ehealth = 60;
	int currente = 0;
	int ecentrex = 100;
	int ecentrey = 100;
	boolean r = true;
	boolean f = false;
	boolean fly = false;
	boolean up = true;
	boolean rest = true;
	boolean left = false;
	int current = 0;
    BufferedImage img = null;
    BufferedImage bbullet0 = null;
    BufferedImage bbullet1 = null;
    BufferedImage bbullet2 = null;
    BufferedImage rbullet0 = null;
    BufferedImage rbullet1 = null;
    BufferedImage rbullet2 = null;
    BufferedImage ev = null;
	int state = 0;
	boolean dead = false;
	int NoImages = 6;
	int time = 160;
	int centrex = 100;
	int centrey = 100;
	double fire =  System.currentTimeMillis(); 
	double clock =  System.currentTimeMillis(); 
	double fall =  System.currentTimeMillis(); 
	double plat = System.currentTimeMillis(); 
	int walk = 13;
	int run = 22;
	boolean start = true;
	ArrayList<Integer> rframe = new ArrayList<Integer>();
	ArrayList<Integer> bframe = new ArrayList<Integer>();
	ArrayList<Integer> rdirection = new ArrayList<Integer>();
	ArrayList<Integer> bdirection = new ArrayList<Integer>();
	ArrayList<Integer> rbulletx = new ArrayList<Integer>();
	ArrayList<Integer> bbulletx = new ArrayList<Integer>();
	ArrayList<Integer> rbullety = new ArrayList<Integer>();
	ArrayList<Integer> bbullety = new ArrayList<Integer>();
	ArrayList<Integer> floorsx1 = new ArrayList<Integer>();
	ArrayList<Integer> floorsy1 = new ArrayList<Integer>();
	ArrayList<Integer> floorsx2 = new ArrayList<Integer>();
	ArrayList<Integer> floorsy2 = new ArrayList<Integer>();
	ArrayList<Integer> floorsx3 = new ArrayList<Integer>();
	ArrayList<Integer> floorsy3 = new ArrayList<Integer>();
	ArrayList<Integer> floorsx4 = new ArrayList<Integer>();
	ArrayList<Integer> floorsy4 = new ArrayList<Integer>();
	int floorheight;
	int floorwidth;
	
	public void init() {
		super.init();
		Window w = sm.getFullScreenWindow();
		w.addKeyListener(this);
		w.addMouseListener(this);
		w.addMouseMotionListener(this);
	}

	public static void main(String[] args) {
		new charge().run();
	}
	
	public void fall(){
		rest = false;
		for (int x = 0;x<floorsx1.size();x++){
		if ((centrex<=(floorsx1.get(x)+floorwidth)) && (centrex>=(floorsx1.get(x)-img.getWidth())) && ((floorheight)>Math.abs((centrey+img.getHeight())-(floorsy1.get(x)+(floorheight))))){
			rest = true;
			up = false;
		}
		}
		for (int x = 0;x<floorsx2.size();x++){
		if ((centrex<=(floorsx2.get(x)+floorwidth)) && (centrex>=(floorsx2.get(x)-img.getWidth())) && ((floorheight)>Math.abs((centrey+img.getHeight())-(floorsy2.get(x)+(floorheight))))){
			rest = true;
			up = true;
		}
		}
		for (int x = 0;x<floorsx3.size();x++){
		if ((centrex<=(floorsx3.get(x)+floorwidth)) && (centrex>=(floorsx3.get(x)-img.getWidth())) && ((floorheight)>Math.abs((centrey+img.getHeight())-(floorsy3.get(x)+(floorheight))))){
			rest = true;
			up = false;
		}
		}
		for (int x = 0;x<floorsx4.size();x++){
		if ((centrex<=(floorsx4.get(x)+floorwidth)) && (centrex>=(floorsx4.get(x)-img.getWidth())) && ((floorheight)>Math.abs((centrey+img.getHeight())-(floorsy4.get(x)+(floorheight))))){
			rest = true;
			up = true;
		}
		}
	}
	
	public void populate(){
		try {
			bbullet0 = ImageIO.read(new File("animation//bfire0.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			bbullet1 = ImageIO.read(new File("animation//bfire1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			bbullet2 = ImageIO.read(new File("animation//bfire2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			rbullet0 = ImageIO.read(new File("animation//rfire0.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			rbullet1 = ImageIO.read(new File("animation//rfire1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			rbullet2 = ImageIO.read(new File("animation//rfire2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		floorsx1.add(5);
		floorsx1.add(5);
		floorsx1.add(5);
		floorsx1.add(5);
		floorsx2.add((sm.getWidth()-floorwidth)/3);
		floorsx2.add((sm.getWidth()-floorwidth)/3);
		floorsx2.add((sm.getWidth()-floorwidth)/3);
		floorsx2.add((sm.getWidth()-floorwidth)/3);
		floorsx3.add((2*(sm.getWidth()-floorwidth))/3);
		floorsx3.add((2*(sm.getWidth()-floorwidth))/3);
		floorsx3.add((2*(sm.getWidth()-floorwidth))/3);
		floorsx3.add((2*(sm.getWidth()-floorwidth))/3);
		floorsx4.add(sm.getWidth()-floorwidth-5);
		floorsx4.add(sm.getWidth()-floorwidth-5);
		floorsx4.add(sm.getWidth()-floorwidth-5);
		floorsx4.add(sm.getWidth()-floorwidth-5);
		floorsy1.add(0);
		floorsy1.add((sm.getHeight())/3);
		floorsy1.add((2*sm.getHeight())/3);
		floorsy1.add(sm.getHeight());
		floorsy2.add(0);
		floorsy2.add((sm.getHeight())/3);
		floorsy2.add((2*sm.getHeight())/3);
		floorsy2.add(sm.getHeight());
		floorsy3.add(0);
		floorsy3.add((sm.getHeight())/3);
		floorsy3.add((2*sm.getHeight())/3);
		floorsy3.add(sm.getHeight());
		floorsy4.add(0);
		floorsy4.add((sm.getHeight())/3);
		floorsy4.add((2*sm.getHeight())/3);
		floorsy4.add(sm.getHeight());
	}

	public void draw(Graphics2D g) {
		floorheight = (sm.getHeight()/65);
		floorwidth = (sm.getWidth()/5);
		if (start == true){
			populate();
			start = false;
		}
		g.setColor(Color.white);
		g.fillRect(0, 0, sm.getWidth(), sm.getHeight());
		if (centrex<0){
			centrex = centrex+sm.getWidth();
		}
		if (ecentrex<0){
			ecentrex = ecentrex+sm.getWidth();
		}
		if (centrey<0){
			centrey = centrey+sm.getHeight();
		}
		if (ecentrey<0){
			centrey = centrey+sm.getHeight();
		}
		if (centrey>sm.getHeight()){
			centrey = centrey-sm.getHeight();
		}
		if (centrex>sm.getWidth()){
			centrex = centrex-sm.getWidth();
		}
		if (ecentrey>sm.getHeight()){
			ecentrey = ecentrey-sm.getHeight();
		}
		if (ecentrex>sm.getWidth()){
			ecentrex = ecentrex-sm.getWidth();
		}
		
		if (System.currentTimeMillis()-fire > 10){
			if (f == true){
				if (r == true){
					r = false;
				} else {
					r = true;
				}
				if (left == true){
					if (r == true){
						rframe.add(0);
						rbulletx.add(centrex);
						rbullety.add(centrey);
						rdirection.add(1);
					} else {
						bframe.add(0);
						bbulletx.add(centrex);
						bbullety.add(centrey);
						bdirection.add(1);
					}
				} else {
					if (r == true){
						rframe.add(0);
						rbulletx.add(centrex);
						rbullety.add(centrey);
						rdirection.add(0);
					} else {
						bframe.add(0);
						bbulletx.add(centrex);
						bbullety.add(centrey);
						bdirection.add(0);
					}
				}
				f = false;
			}
			
			for (int x = 0;x<bbulletx.size();x++){
				int tmp = 0;
				int tmpp = 0;
				BufferedImage image = null;
				switch(bframe.get(x)){
					case (0):
						image = bbullet0;
						break;
					case(1):
						image = bbullet1;
					    break;
					case(2):
						image = bbullet2;
						break;
				}
				if (bdirection.get(x) == 1){
					g.drawImage(image, bbulletx.get(x)-image.getWidth(),bbullety.get(x), null);
				tmpp = (bbulletx.get(x)-25);
				bbulletx.set(x, tmpp);
				} else if (bdirection.get(x) == 0){
					g.drawImage (image, (bbulletx.get(x)+image.getWidth()*2), bbullety.get(x), bbulletx.get(x)+image.getWidth(), (bbullety.get(x)+image.getHeight()), 0, 0, (image.getWidth()), (image.getHeight()),null);
					tmpp = (bbulletx.get(x)+25);
					bbulletx.set(x, tmpp);
				}
				tmp = (bframe.get(x)+1);
				if (tmp>2){
					tmp = 0;
				}
				bframe.set(x, tmp);
				if ((bbulletx.get(x) < 0) || (bbulletx.get(x) > sm.getWidth())){
					bbulletx.remove(x);
					bbullety.remove(x);
					bdirection.remove(x);
					bframe.remove(x);
				}
			}
			for (int x = 0;x<rbulletx.size();x++){
				int tmp = 0;
				int tmpp = 0;
				BufferedImage image = null;
				switch(rframe.get(x)){
				case (0):
					image = rbullet0;
					break;
				case(1):
					image = rbullet1;
				    break;
				case(2):
					image = rbullet2;
					break;
			}
				if (rdirection.get(x) == 1){
					g.drawImage(image, rbulletx.get(x)-image.getWidth(),rbullety.get(x), null);
				tmpp = (rbulletx.get(x)-25);
				rbulletx.set(x, tmpp);
				} else if (rdirection.get(x) == 0){
					g.drawImage (image, (rbulletx.get(x)+image.getWidth()*2), rbullety.get(x), rbulletx.get(x)+image.getWidth(), (rbullety.get(x)+image.getHeight()), 0, 0, (image.getWidth()), (image.getHeight()),null);
					tmpp = (rbulletx.get(x)+25);
					rbulletx.set(x, tmpp);
				}
				tmp = (rframe.get(x)+1);
				if (tmp>2){
					tmp = 0;
				}
				rframe.set(x, tmp);
				if ((rbulletx.get(x) < 0) || (rbulletx.get(x) > sm.getWidth())){
					rbulletx.remove(x);
					rbullety.remove(x);
					rdirection.remove(x);
					rframe.remove(x);
				}
			}
			
		}
		if (System.currentTimeMillis()-plat > 20){
			int tmp = 0;
			for (int x = 0;x<floorsx1.size();x++){
				tmp = (floorsy1.get(x)+3);
				if (tmp>sm.getHeight()){
					tmp = 0;
				}
				floorsy1.set(x, tmp);
			}
			for (int x = 0;x<floorsx2.size();x++){
				tmp = (floorsy2.get(x)-3);
				if (tmp<0){
					tmp = sm.getHeight();
				}
				floorsy2.set(x, tmp);
			}
			for (int x = 0;x<floorsx3.size();x++){
				tmp = (floorsy3.get(x)+3);
				if (tmp>sm.getHeight()){
					tmp = 0;
				}
				floorsy3.set(x, tmp);
			}
			for (int x = 0;x<floorsx4.size();x++){
				tmp = (floorsy4.get(x)-3);
				if (tmp<0){
					tmp = sm.getHeight();
				}
				floorsy4.set(x, tmp);
			}
			g.setColor(Color.BLACK);
			for (int x = 0;x<floorsx1.size();x++){
				g.fillRect(floorsx1.get(x),floorsy1.get(x),floorwidth,floorheight);
				g.fillRect(floorsx2.get(x),floorsy2.get(x),floorwidth,floorheight);
				g.fillRect(floorsx3.get(x),floorsy3.get(x),floorwidth,floorheight);
				g.fillRect(floorsx4.get(x),floorsy4.get(x),floorwidth,floorheight);
			}
			if ((rest == true) && (up == true)){
				centrey-=3;
			} else if ((rest == true) && (up == false)){
				centrey+=3;
			}
			plat = System.currentTimeMillis();
		}
		if (System.currentTimeMillis()-clock > time){
				try {
					ev = ImageIO.read(new File("animation//evil"+currente+".png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				currente++;
				if (currente > 61){
					currente=0;
				}
			if (state == 0){
					try {
						img = ImageIO.read(new File("animation//still"+current+".png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					current++;
					if (current>NoImages-1){
						current = 0;
					}
			} else if (state == 1){
				if (left == true){
				centrex-=walk;
				} else {
					centrex+=walk;
				}
				try {
					img = ImageIO.read(new File("animation//walk"+current+".png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				current++;
				if (current>NoImages-1){
					current = 0;
				}
			} else if (state == 2){
				if (left == true){
				centrex-=run;
				} else {
					centrex+=run;
				}
				try {
					img = ImageIO.read(new File("animation//run"+current+".png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				current++;
				if (current>NoImages-1){
					current = 0;
				}
			}
			clock = System.currentTimeMillis();
		}
		if (leftof() == false){
		g.drawImage(ev, null, ecentrex, ecentrey);
		} else {
			g.drawImage (ev, 
		             (ecentrex+ev.getWidth()), ecentrey, ecentrex, (ecentrey+ev.getHeight()),
		             0, 0, (ev.getWidth()), (ev.getHeight()),
		             null);
		}
		if ((centrex)<(ecentrex+((ev.getWidth()-img.getWidth())/2))){
			ecentrex-=10;
		} else {
			ecentrex+=10;
		}
		if ((centrey)<(ecentrey+((ev.getHeight()-img.getHeight())/2))){
			ecentrey-=10;
		} else {
			ecentrey+=10;
		}
		if (left == true){
			g.drawImage (img, 
		             (centrex+img.getWidth()), centrey, centrex, (centrey+img.getHeight()),
		             0, 0, (img.getWidth()), (img.getHeight()),
		             null);
			} else {
				g.drawImage(img, null, centrex, centrey);
			}
		if (System.currentTimeMillis()-fall > 40){
			checkehit();
			if (edeath == true){
				ehealth = 60;
				ecentrex = ((int) (Math.floor(Math.random()*(sm.getWidth())+1)))-1;
				ecentrey = ((int) (Math.floor(Math.random()*(sm.getHeight())+1)))-1;
				edeath = false;
			}
			checkdeath();
			fall();
			if (fly == true){
				centrey-=100;
				fly=false;
			} else if (rest == false){
			centrey+=10;
			}
			fall = System.currentTimeMillis();
		}
	}
	public void checkehit(){
		edeath = false;
		for (int x = 0;x<bbulletx.size();x++){
			if ((bbulletx.get(x)<(ecentrex+ev.getWidth())) && (bbulletx.get(x)>ecentrex) && (bbullety.get(x)<(ecentrey+ev.getHeight()) && (bbullety.get(x)>ecentrey))){
				ehealth--;
				bbulletx.remove(x);
				bbullety.remove(x);
				bdirection.remove(x);
				bframe.remove(x);
			}
		}
		for (int x = 0;x<rbulletx.size();x++){
			if ((rbulletx.get(x)<(ecentrex+ev.getWidth())) && (rbulletx.get(x)>ecentrex) && (rbullety.get(x)<(ecentrey+ev.getHeight()) && (rbullety.get(x)>ecentrey))){
				ehealth--;
				rbulletx.remove(x);
				rbullety.remove(x);
				rdirection.remove(x);
				rframe.remove(x);
			}
		}
		if (ehealth<0){
			edeath = true;
		}
	}
	
	public void checkdeath(){
		if (((ev.getWidth()/2)>Math.abs((centrex+(img.getWidth()/2))-(ecentrex+(ev.getWidth()/2)))) && ((ev.getHeight()/2)>Math.abs((centrey+(img.getHeight()/2))-(ecentrey+(ev.getHeight()/2))))){
			centrex = 100;
			centrey = 100;
			ecentrex = sm.getWidth()-100;
			ecentrey = sm.getHeight()-100;
		}
	}
	
	public boolean leftof(){
		if (ecentrex-centrex<0){
			return true;
		} else {
			return false;
		}
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A){
			f = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP){
			state = 1;
			time = 20;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			left = false;
			state = 2;
			time = 10;
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT){
			left = true;
			state = 2;
			time = 10;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE){
			fly = true;
		}
		
	}

	public void keyReleased(KeyEvent e) {
		if (((e.getKeyCode() == KeyEvent.VK_UP) && (state == 1)) || ((e.getKeyCode() == KeyEvent.VK_RIGHT) && (state == 2)) || ((e.getKeyCode() == KeyEvent.VK_LEFT) && (state == 2))){
			state = 0;
			time = 80;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void mouseClicked(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {

	}

	public void mouseMoved(MouseEvent e) {

	}

}
