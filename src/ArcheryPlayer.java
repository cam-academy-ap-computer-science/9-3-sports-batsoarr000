
public class ArcheryPlayer extends Player{
	//private
	//public
	private boolean hitarget;
	private double hitrate;
	private int boweight;
	public String toString() {
		return super.toString() + "Hit Target" + hitarget + "Hit Rate" + hitrate + "Bow Weight" + boweight;
	}
	public boolean isHitarget() {
		return hitarget;
	}
	public void setHitarget(boolean hitarget) {
		this.hitarget = hitarget;
	}
	public double getHitrate() {
		return hitrate;
	}
	public void setHitrate(double hitrate) {
		this.hitrate = hitrate;
	}
	public int getBoweight() {
		return boweight;
	}
	public void setBoweight(int boweight) {
		this.boweight = boweight;
	}
}
