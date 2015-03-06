package selfienator;

public class Commander implements ICommands, IMotorControler {

	public IMotor motorX;
	public IMotor motorY;

	@Override
	public void takeShot(ShotSettings settings) {
		if (ShotSettings.ShotWithFocus == settings) {

		} else if (ShotSettings.ShotWithoutFocus == settings) {

		}
	}

	@Override
	public void moveTo(double x, double y) {
		moveTo(x, y, Directions.CLOCKWAISE);
	}

	@Override
	public void moveTo(double x, double y, Directions dir) {
		moveTo(x, y, dir);
	}

	@Override
	public void moveTo(double x, double y, Directions dirX, Directions dirY) {
		x = x % 360;
		y = y % 360;

		motorX.moveTo(x, dirX);
		motorY.moveTo(x, dirY);

	}

	public void move(Directions a) {

	}

}
