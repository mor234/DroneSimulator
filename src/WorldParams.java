
public class WorldParams {
	public static int lidarLimit = 300; // in cm
	public static int lidarNoise = 1; // in cm 3
	public static double CMPerPixel = 2.5;
	public static double accelerate_per_second = 1; // 1 meter per second
	public static double max_speed = 0.5; // 1 meter per second - max = 3
	public static double rotation_per_second = 60; // whole round per second
	public static int min_motion_accuracy = 0; // 2
	public static int max_motion_accuracy = 1; // 5
	public static int min_rotation_accuracy = 0; // 2
	public static int max_rotation_accuracy = 1; // 5
	public static double min_dis_drone_radius = 10.2; //  the size of the drone + deflection of 2%
	public static int hz_sensor = 10;

}
