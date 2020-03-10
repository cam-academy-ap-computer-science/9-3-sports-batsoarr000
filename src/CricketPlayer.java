
public class CricketPlayer extends Player{
	//private
	//public
	private boolean hitball;
	private int seasonhit;
	private double hitrate;
	public String toString() {
		return super.toString() + "Hit Ball" + hitball + "Season Hit" + seasonhit + "Hit Rate" + hitrate;
	}
	public boolean isHitball() {
		return hitball;
	}
	public void setHitball(boolean hitball) {
		this.hitball = hitball;
	}
	public int getSeasonhit() {
		return seasonhit;
	}
	public void setSeasonhit(int seasonhit) {
		this.seasonhit = seasonhit;
	}
	public double getHitrate() {
		return hitrate;
	}
	public void setHitrate(double hitrate) {
		this.hitrate = hitrate;
	}
}
