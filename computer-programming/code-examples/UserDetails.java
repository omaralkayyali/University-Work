import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        // إنشاء كائن Scanner لقراءة المدخلات من الشاشة (Console)
        Scanner input = new Scanner(System.in);
        
        // طلب إدخال الاسم الأول والعمر من المستخدم
        System.out.print("Enter your first name and age: ");
        String name = input.next();
        int age = input.nextInt();
        
        // استخدام System.out.printf لطباعة مخرجات منسقة باحترافية
        // %s تعني وضع نص (String) في هذا المكان، و %d تعني وضع رقم صحيح (Integer)
        System.out.printf("Hello %s! Next year you will be %d years old.\n", name, (age + 1));
        
        // إغلاق كائن Scanner لتحرير موارد النظام
        input.close();
    }
}