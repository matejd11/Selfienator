package selfienator;

import selfienator.Directions;
import selfienator.IMotor;

public class Motor implements IMotor {

	public String name;

	public Motor() {

	}

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
	public void moveTo(int angel, Directions dir) {

	}

}
