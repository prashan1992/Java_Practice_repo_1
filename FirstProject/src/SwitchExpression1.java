
public class SwitchExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
/*	Day day = ...; // any day
	int len =
	    switch (day) {
	        case MONDAY, FRIDAY, SUNDAY -> 6;
	        case TUESDAY                -> 7;
	        case THURSDAY, SATURDAY     -> 8;
	        case WEDNESDAY              -> 9;
	    };
	System.out.println("len = " + len);

}
int quarter = ...; // any value

String quarterLabel =
    switch (quarter) {
        case 0  -> "Q1 - Winter";
        case 1  -> "Q2 - Spring";
        case 2  -> "Q3 - Summer";
        case 3  -> "Q3 - Summer";
        default -> "Unknown quarter";
    };
 // Be careful, this code does NOT compile!
    public String convertToLabel(int quarter) {
        String quarterLabel =
            switch (quarter) {
                case 0  -> {
                    System.out.println("Q1 - Winter");
                    return "Q1 - Winter";
                }
                default -> "Unknown quarter";
            };
        return quarterLabel;
    }

    
    public String convertToLabel(int quarter) {
        String quarterLabel =
            switch (quarter) {
                case 0  -> {
                    System.out.println("Q1 - Winter");
                    yield "Q1 - Winter";
                }
                default -> "Unknown quarter";
            };
        }
        return quarterLabel;
    }
    int quarter = ...; // any value

    String quarterLabel =
        switch (quarter) {
            case 0 :  yield "Q1 - Winter";
            case 1 :  yield "Q2 - Spring";
            case 2 :  yield "Q3 - Summer";
            case 3 :  yield "Q3 - Summer";
            default: System.out.println("Unknown quarter");
                     yield "Unknown quarter";
        };
*/