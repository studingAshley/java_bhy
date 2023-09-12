package p0908;

public class Time {
	int hour;
	int minute;
	double second;
	
	Time()
	{
		hour = 0 ;
		minute = 0 ;
		second = 0 ;
	}

	Time(int hour, int minute, double second)
	{
		this();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
}
