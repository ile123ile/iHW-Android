package model;

import java.util.Date;

public abstract class Day {
	protected Date date;
	protected Time startTime;
	protected Time endTime;
	protected Period[] periods;
	
	public Date getDate() { return date; }
	public Time getStartTime() { return startTime; }
	public Time getEndTime() { return endTime; }
}
