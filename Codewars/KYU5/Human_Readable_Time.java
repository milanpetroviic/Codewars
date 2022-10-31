package Codewars.KYU5;

/*
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59

The maximum time never exceeds 359999 (99:59:59)
 */

public class Human_Readable_Time {
    public static String makeReadable(int second) {
        int hourToSeconds = 3600;
        int minutToSeconds = 60;

        String hourse = Integer.toString((second / hourToSeconds));
        String minutes = Integer.toString((second % hourToSeconds) / minutToSeconds);
        String seconds = Integer.toString(second % minutToSeconds);

        if (hourse.length() == 1) {
            hourse = "0" + hourse;
        }
        if (minutes.length() == 1) {
            minutes = "0" + minutes;
        }
        if (seconds.length() == 1) {
            seconds = "0" + seconds;
        }

        return hourse + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(359999));
        System.out.println(makeReadable(3600));
    }
}