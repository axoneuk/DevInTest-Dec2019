package uk.axone.devintest.flowcontrol;

public class FlowControl {

    //Given a day of the week
    //Mon, Tue, Wed - Print 'Weekday'
    //Thu - Print 'Midweek'
    //Fri - Print "Thank God its Friday!"
    //Sat or Sun - Print 'Weekend'


    public void useIfElse(String day){
        if(day.equals("Mon") || day.equals("Tue") || day.equals("Wed")){
           System.out.println("Weekday");
        }
        else if(day.equals("Thu")){
            System.out.println("Midweek");
        }
        else if(day.equals("Fri")){
            System.out.println("Thank God its Friday!");
        }
        else if(day.equals("Sat") || day.equals("Sun")){
            System.out.println("weekend");
        }
        else{
            System.out.println("Invalid Day!");
        }
    }

    public void useSwitch(String day){
        switch(day){
            case "Mon":
                System.out.println("WeekDay");
                break;
            case "Tue":
                System.out.println("Weekday");
                break;
            case "Wed":
                System.out.println("Weekday");
                break;
            case "Thu" :
                System.out.println("Midweek");
                break;
            case "Fri" :
                System.out.println("Thank God..!");
                break;
            case "Sat":
                System.out.println("Weekend");
                break;
            case "Sun" :
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Day!");
        }
    }


    public static void main(String[] args) {
        FlowControl fCon;
        fCon = new FlowControl();
        int i;
        i = 19230;
        //fCon.useIfElse("Mon");
        fCon.useSwitch("uhieirf");
    }

}
