// المادة: تراكيب البيانات
// الموضوع: Tracing Code Segments (Stack, Recursion, UnsortedList)
// لغة البرمجة: Java

import java.util.Stack;

public class DataStructuresTracing {

    // المقطع الأول: تتبع عمليات المكدس (من امتحان 2023)
    public static void traceStackSample1() {
        Stack<Integer> st = new Stack<>();
        int y = 5;
        int x;
        st.push(2);
        st.push(y);
        x = st.pop();
        st.push(x + 4);

        while (!st.isEmpty()) {
            y = st.pop();
            System.out.println(y);
        }
        System.out.println("x = " + x + " y = " + y);
        // المخرجات المتوقعة: 
        // 9
        // 2
        // x = 5 y = 2
    }

    // المقطع الثاني: تتبع عمليات المكدس (من امتحان 2024)
    public static void traceStackSample2() {
        Stack<Integer> st = new Stack<>();
        int y = 3;
        int x = 2;
        st.push(8);
        st.push(x);
        st.push(x * y);
        x = st.pop();
        st.push(y + 1);

        while (!st.isEmpty()) {
            y = st.pop();
            System.out.println(y);
        }
        System.out.println("x = " + x + " y = " + y);
        // المخرجات المتوقعة:
        // 4
        // 2
        // 8
        // x = 6 y = 8
    }

    // المقطع الثالث: دالة الاستدعاء الذاتي الحسابية fun(m)
    public static int fun(int m) {
        if (m > 2) {
            return m + fun(m - 2);
        } else {
            return m;
        }
    }

    // المقطع الرابع: دالة الاستدعاء الذاتي التراكمية MyFun(num)
    public static int MyFun(int num) {
        if (num == 0) {
            return num;
        } else {
            return num + MyFun(num - 1);
        }
    }

    // المقطع الخامس: تتبع القائمة غير المرتبة (Unsorted List Client Code)
    public static void traceUnsortedListClient() {
        char letter = 'V';
        // بفرض وجود كلاس UnsortedList مسبق الصنع
        // UnsortedList myList = new UnsortedList();
        // myList.insert(letter);
        // myList.insert('C');
        // myList.insert('S');
        // myList.remove('C');
        // myList.insert('K');
    }
}