package chaptersix;

import java.util.*;

class Dates2 {
	public static void main(String[] args) {
		Date d1 = new Date(1000000000000L);
		System.out.println("1st date " + d1.toString());
		Calendar c = Calendar.getInstance();
		c.setTime(d1); // #1
		if (Calendar.SUNDAY == c.getFirstDayOfWeek()) // #2
			System.out.println("Sunday is the first day of the week");
		System.out.println("trillionth milli day of week is "
				+ c.get(Calendar.DAY_OF_WEEK)); // #3
		c.add(Calendar.MONTH, 1); // #4
		c.add(Calendar.HOUR, -4); // subtract 4 hours from c's value
		c.add(Calendar.YEAR, 2); // add 2 years to c's value
		c.add(Calendar.DAY_OF_WEEK, -2); // subtract two days from
		// c's value
		Date d2 = c.getTime(); // #5
		System.out.println("new date " + d2.toString());
	}
}
