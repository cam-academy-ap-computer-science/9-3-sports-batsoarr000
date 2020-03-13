
public class Player {
	//private
	//public
	private int number;
	private String name;
	private boolean isteam;
	private Player[] player;
	public void Player(int number, String name, boolean isteam, boolean b, int i, double d) {
	
	}
	public String toString() {
		return "Name" + name + "Number" + number + "IsTeam" + isteam;
	}
	public boolean isIsteam() {
		return isteam;
	}
	public void setIsteam(boolean isteam) {
		this.isteam = isteam;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
