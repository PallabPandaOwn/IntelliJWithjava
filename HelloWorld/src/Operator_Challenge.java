public class Operator_Challenge {
    public static void main(String[] args) {
        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double  resultTotal = (firstVariable+secondVariable)*100.00d;
        System.out.println("Total Result - "+ resultTotal);
        double reminder = resultTotal % 40.00d;
        System.out.println("Reminder - "+ reminder);
/*
        System.out.println(reminder);
        boolean isZero = true;
        if(reminder == 0.00d) {
            System.out.println("Reminder is : 0.00");
            System.out.println(isZero);
        }
*/

        boolean isReminder = reminder == 0.00d;
        System.out.println("IsNoReminder - "+ isReminder);
        if(!isReminder)
            System.out.println("Got some reminder");
    }
}
