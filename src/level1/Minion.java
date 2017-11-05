package level1;

import static org.junit.Assert.*;

import org.junit.Test;



public class Minion {
	private String name = "JEFF";
	private int eyes = 1; 
	private String color = "JEFF"; 
	private String master = "JEFF";
	
	public Minion(String nam, int eye, String colo, String mast) {
		name = nam;
		eyes = eye;
		color = colo;
		master = mast;
		
		
		
	}
	

	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getMaster() {
		return master;
	}
	public int getEyes() {
		return eyes;
	}
	public void setMaster(String newMaster) {
		master = newMaster;

	}
	
}




