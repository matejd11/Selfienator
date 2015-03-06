package selfienator;

public interface IMotor {
	public String name = "Motor";

	public void moveTo(double angle, Directions dir);
}
