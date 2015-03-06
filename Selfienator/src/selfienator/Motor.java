package selfienator;

public class Motor implements IMotor {

	public String name;
	private double angle = 0;

	public Motor(Axis axis) {
		if (Axis.X == axis) {
			name = "MotorX";
		} else if (Axis.Y == axis) {
			name = "MotorY";
		} else {
			name = "Motor";
		}
	}

	@Override
	public void moveTo(double angle, Directions dir) {
		this.angle = angle;
	}

	/**
	 * @return the angle
	 */
	public double getAngle() {
		return angle;
	}
}
