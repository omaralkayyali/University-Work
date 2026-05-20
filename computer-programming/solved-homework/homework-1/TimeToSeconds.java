import java.util.Scanner;

public class TimeToSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of hours: ");
        int hours = input.nextInt();
        
        System.out.print("Enter number of minutes: ");
        int minutes = input.nextInt();
        
        System.out.print("Enter number of seconds: ");
        int seconds = input.nextInt();
        
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        
        System.out.println("Elapsed time in seconds: " + totalSeconds);
        input.close();
    }
}