package selfienator;

public interface ICommands {

	public void takeShot(ShotSettings settings);
	public void moveTo(int x, int y);
	public void moveTo(int x, int y, Directions dir);
	public void moveTo(int x, int y, Directions dirX, Directions dirY);
	
}
