import java.util.Scanner;

public class RunnerAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // قراءة وقت المتسابق الأول
        System.out.print("Enter time of runner 1 (in minutes): ");
        double runner1 = input.nextDouble();
        
        // قراءة وقت المتسابق الثاني
        System.out.print("Enter time of runner 2 (in minutes): ");
        double runner2 = input.nextDouble();
        
        // قراءة وقت المتسابق الثالث
        System.out.print("Enter time of runner 3 (in minutes): ");
        double runner3 = input.nextDouble();
        
        // حساب المتوسط الحسابي للأوقات الثلاثة
        double averageTime = (runner1 + runner2 + runner3) / 3.0;
        
        // طباعة النتيجة النهائية للمستخدم
        System.out.println("Average time: " + averageTime);
        
        input.close();
    }
}