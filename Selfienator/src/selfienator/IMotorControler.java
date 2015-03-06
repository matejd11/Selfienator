package selfienator;

public interface IMotorControler {
	public IMotor motorX = new Motor(Axis.X);
	public IMotor motorY = new Motor(Axis.Y);
}
