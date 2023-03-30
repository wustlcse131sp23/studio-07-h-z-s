package studio7;

public class HockeyPlayer {
	private String handPreference = "left";
	private String ShootAbility = "either";
	private int goal = 0;
	private int assit = 0;
	
	public HockeyPlayer(String a, String s) {
		handPreference = a;
		ShootAbility = s;
	}
	
	public String gethandPreference() {
		return handPreference;
	}
	
	public String getShootAbility() {
		return ShootAbility;
	}
	
	public int getGoal() {
		return goal;
	}
	
	public int getAssit() {
		return assit;
	}
	
	
	
	
	public int points() {
		return goal + assit;
	}
	
	public boolean isCompleted(int playerfinished, int allturns) {
		if (playerfinished < allturns) {
			return false;
		}else {
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
