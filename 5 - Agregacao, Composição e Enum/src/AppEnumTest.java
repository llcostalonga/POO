
public class AppEnumTest {
	 Day day;
	    
	    public AppEnumTest(Day day) {
	        this.day = day;
	    }
	    
	    public void tellItLikeItIs() {
	        switch (day) {
	            case MONDAY:
	                System.out.println("Mondays are bad.");
	                break;
	                    
	            case FRIDAY:
	                System.out.println("Fridays are better.");
	                break;
	                         
	            case SATURDAY: case SUNDAY:
	                System.out.println("Weekends are best.");
	                break;
	                        
	            default:
	                System.out.println("Midweek days are so-so.");
	                break;
	        }
	    }
	    
	    public static void main(String[] args) {
	    	
	    	
	        AppEnumTest firstDay = new AppEnumTest(Day.MONDAY);
	        firstDay.tellItLikeItIs();
	        AppEnumTest thirdDay = new AppEnumTest(Day.WEDNESDAY);
	        thirdDay.tellItLikeItIs();
	        AppEnumTest fifthDay = new AppEnumTest(Day.FRIDAY);
	        fifthDay.tellItLikeItIs();
	        AppEnumTest sixthDay = new AppEnumTest(Day.SATURDAY);
	        sixthDay.tellItLikeItIs();
	        AppEnumTest seventhDay = new AppEnumTest(Day.SUNDAY);
	        seventhDay.tellItLikeItIs();
	    }

}
