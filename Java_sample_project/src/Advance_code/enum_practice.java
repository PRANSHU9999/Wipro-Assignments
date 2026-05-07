package Advance_code;
import java.util.*;
enum Day {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSADY,FRIDAY,SATUREDAY}
public class enum_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day day=Day.WEDNESDAY;
		switch(day)
		{
		case MONDAY:System.out.println("Today is Monday");
		break;
		case TUESDAY:System.out.println("Today is TUESDAY");
		break;
		case WEDNESDAY:System.out.println("Today is WEDNESDAY");
		break;
		case THURSADY:System.out.println("Today is THURSADY");
		break;
		case FRIDAY:System.out.println("Today is FRIDAY");
		break;
		case SATUREDAY:System.out.println("Today is SATUREDAY");
		break;
		case SUNDAY:System.out.println("Today is SUNDAY");
		break;
		}
	}

}
