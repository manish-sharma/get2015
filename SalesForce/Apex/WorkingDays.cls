public with sharing class WorkingDays {
    public static void getWorkingDays(Date startDate,Date endDate) {
    	Integer numberOfDays = startDate.daysBetween(endDate);
        System.debug('numberOfDays - ' + numberOfDays);
		Integer numberOfWeeks = numberOfDays/7;
		Integer remainingDays = Math.mod(numberOfDays,7);
		Integer diffStart = startDate.daysBetween(DATE.newInstance(2016,1,2));
        Integer diffLast = endDate.daysBetween(DATE.newInstance(2016,1,2));
		Integer weekDays = numberOfWeeks*5;
        System.debug('weekDays' + weekDays);
		if( Math.mod(diffStart,7) == 0) {
            remainingDays = remainingDays - 2;
            if(Math.mod(diffLast,7) == 0) {
                remainingDays = remainingDays - 1;
            }
            else if(Math.mod(diffLast,7) == 1) {
                remainingDays = remainingDays - 2;
            }
             
        }
		else if (Math.mod(diffStart,7) == 1) {
            remainingDays = remainingDays - 1;
			 if(Math.mod(diffLast,7) == 0) {
                remainingDays = remainingDays - 1;
            }
            else if(Math.mod(diffLast,7) == 1) {
                remainingDays = remainingDays - 2;
            }
            
		}
        weekDays = weekDays + remainingDays;
		System.debug(weekDays);
    }
}