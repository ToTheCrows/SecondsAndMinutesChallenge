public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(5,30));
        System.out.println(getDurationString(0,59));
        System.out.println(getDurationString(-2,58));
        System.out.println(getDurationString(0,61));
        System.out.println(getDurationString(290,30));
        System.out.println("\n");
        System.out.println(getDurationString(5000));
        System.out.println(getDurationString(50));
        System.out.println(getDurationString(450));
    }

    public static String getDurationString (int minutes, int seconds) {
        if( minutes < 0 || ( seconds < 0 || seconds > 59 )) return "Invalid value";

        int hours = (int) minutes / 60;
        minutes = (int) minutes % 60;

        String returnValue = hours+"h "+minutes+"m "+seconds+"s";
        return returnValue;
    }

    public static String getDurationString (int seconds) {
        if( seconds < 0 ) return "Invalid value";

        int minutes = (int) seconds / 60;
        seconds = (int) seconds % 60;

        return getDurationString(minutes, seconds);
    }
}