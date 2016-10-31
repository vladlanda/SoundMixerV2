package utils;

public class PlayerMath {

	public static double microToMin(long micros){
		return (micros/Consts.MICRO_TO_MIN_RATIO);
	}
	public static double microToSec(long micros){
		return (micros/Consts.MICRO_TO_SEC_RATIO)%60;
	}
	public static int timeProgress(long microsLength,long microsCurrent){
		return (int)((microsCurrent/(double)microsLength) * 100);
	}
	
}