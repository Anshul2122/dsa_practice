package nqt_practice;

public class Ques_3 {
    public static void main(String[] args) {
        int n = 21;
        String s = "sunday";

        int nextSunday = 0;
        switch (s) {
            case "thursday":
                nextSunday = 3;
                break;
            case "friday":
                nextSunday = 2;
                break;
            case "monday":
                nextSunday = 6;
                break;
            case "tuesday":
                nextSunday = 5;
                break;
            case "wednesday":
                nextSunday = 4;
                break;
            case "saturday":
                nextSunday = 1;
                break;
            case "sunday":
                nextSunday = 7;
                break;
            default:
                nextSunday = 0;
                break;
        }
            n = n-nextSunday;
            int count = 1;
            count = count + n/7;

                System.out.println(count);



        }
    }
