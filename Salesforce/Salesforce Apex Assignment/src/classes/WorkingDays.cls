/* Question 3 number of working days between   two days excluding both days(Saturday and Sunday is nonworking */

public class WorkingDays {
    
    //array of seven boolean indicating working days, Monday is index 0
    private static final List<Boolean> isWorkingDay;
    //count of the number of working days in the array
    private static final Integer workingDaysInWeek;
    static {
        isWorkingDay = new List<Boolean> { true, true, true, true, true, false, false };
            workingDaysInWeek = 5;
    }
    private static final Date monday = Date.newInstance(1900, 1, 1);
    private static Integer getDayOfWeek(Date value) {
        return Math.mod(monday.daysBetween(value), 7);
    }
    
    public static Integer getWorkingDays(Date startDate, Date endDate) {
        Integer difference = startDate.daysBetween(endDate);
        Integer totalWorkingDay=0;      
        Integer startDay = getDayOfWeek(startDate);
        if(difference == 0) {
            //If the 2 dates are the same day check if the day is a working day or not
            return isWorkingDay[startDay] ? 1 : 0;
        } 
        difference++;
        if(startDay < workingDaysInWeek )
            totalWorkingDay= workingDaysInWeek - startDay;
      	difference -= 7-startDay;
        totalWorkingDay += (difference/7)*workingDaysInWeek;
        Integer remainDay = Math.mod(difference ,7);
        if(remainDay < workingDaysInWeek )
            totalWorkingDay+=remainDay;
        else
            totalWorkingDay+=workingDaysInWeek;
        return totalWorkingDay;
        
    }
    
}