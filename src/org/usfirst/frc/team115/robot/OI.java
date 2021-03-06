package org.usfirst.frc.team115.robot;



import edu.wpi.first.wpilibj.Joystick;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 *
 * @author Lee Mracek, Akhil Palla
 */
public class OI {
	private Joystick driveJoystick;

	public OI() {
		driveJoystick = new Joystick(RobotMap.JOYSTICK_DRIVE);
	}


	public Joystick getDriveJoystick() {
		return driveJoystick;
	}

}