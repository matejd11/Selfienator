package selfienator;

public interface ICommands {

	public void takeShot(ShotSettings settings);

	public void moveTo(double x, double y);

	public void moveTo(double x, double y, Directions dir);

	public void moveTo(double x, double y, Directions dirX, Directions dirY);

}
