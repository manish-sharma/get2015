public class BusinessDays {
	//array of seven boolean indicating working days, Monday is index 0
private static final List<Boolean> isWorkingDay;
//count of the number of working days in the array
private static final Integer workingDaysInWeek;
static {
    //my real implementation uses the Salesforce BusinessHours Object to populate this array
    isWorkingDay = new List<Boolean> { true, true, true, true, true, false, false };
    //You will have real problems if this number does not match the number of true flags in the array
    workingDaysInWeek = 5;
}

private static final Date monday = Date.newInstance(1900, 1, 1);
private static Integer getDayOfWeek(Date value) {
    return Math.mod(monday.daysBetween(value), 7);
}

public static Integer getWorkingDays(Date startDate, Date endDate) {
    //save some calculations when the number of working days is 0
    Integer totalWorkingDays=0;
    if(workingDaysInWeek == 0 || startDate == null || endDate == null) {
        return 0;
    } else {
        //Integer totalWorkingDays=0;
        Integer startDay= getDayOfWeek(startDate);
        Integer difference = startDate.daysBetween(endDate);
        if(difference == 0)
            //If the 2 dates are the same day check if the day is a working day or not
            return isWorkingDay[getDayOfWeek(startDate)] ? 1 : 0;
        difference++;
        if(startDay< workingDaysInWeek)
            totalWorkingDays = workingDaysInWeek - startDay;
            difference -= 7-startDay;
            totalWorkingDays +=(difference / 7) * workingDaysInWeek;
             Integer remaingDay = Math.mod(difference, 7); 
                if(remaingDay< workingDaysInWeek) 
                    totalWorkingDays += remaingDay;
                else
                 	totalWorkingDays += workingDaysInWeek;
                  return totalWorkingDays;
        
    	}
	}
}