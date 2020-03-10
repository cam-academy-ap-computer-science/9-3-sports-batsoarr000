
public class Player {
	//private
	//public
	private int number;
	private String name;
	private boolean isteam;
	public void main() {
		
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
