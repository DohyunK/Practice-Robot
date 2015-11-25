package org.usfirst.frc.team115.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 *
 * @author Dohyun Kim
 */
public class RobotMap {
	// Drive Motors
	public static final int DRIVE_MOTOR_BACKLEFT = 1;
	public static final int DRIVE_MOTOR_BACKRIGHT = 10;
	public static final int DRIVE_MOTOR_FRONTLEFT = 2;
	public static final int DRIVE_MOTOR_FRONTRIGHT = 9;

	// Joysticks
	public static final int JOYSTICK_DRIVE = 0;

	public static final double DRIVE_MAX_ACCEL = 0;
	public static final int DRIVE_POSITION_KP = 0;
	public static final int DRIVE_POSITION_KI = 0;
	public static final int DRIVE_POSITION_KD = 0;
	public static final int DRIVE_POSITION_KV = 0;
	public static final int DRIVE_POSITION_KA = 0;
	public static final int DRIVE_ON_TARGET_ERROR = 0;

	public static final int DRIVE_STRAIGHT_KP = 0;
	public static final int DRIVE_STRAIGHT_KI = 0;
	public static final int DRIVE_STRAIGHT_KD = 0;

}
