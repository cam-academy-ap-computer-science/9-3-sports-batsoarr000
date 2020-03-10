
public class ConoingPlayer extends Player{
	//private
	//public
	private boolean inwater;
	private int stroke;
	private double strokespeed;
	public String toString() {
		return super.toString() + "In Water" + inwater + "Stroke" + stroke + "Stroke Speed" + strokespeed;
	}
	public boolean isInwater() {
		return inwater;
	}
	public void setInwater(boolean inwater) {
		this.inwater = inwater;
	}
	public int getStroke() {
		return stroke;
	}
	public void setStroke(int stroke) {
		this.stroke = stroke;
	}
	public double getStrokespeed() {
		return strokespeed;
	}
	public void setStrokespeed(double strokespeed) {
		this.strokespeed = strokespeed;
	}
}
