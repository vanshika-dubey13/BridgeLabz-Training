package com.oopsscenariobased.eventmanagementplatform;

public interface ISchedulable {
	void schedule();
	void cancel();
	void reschedule(String newDate);
}
