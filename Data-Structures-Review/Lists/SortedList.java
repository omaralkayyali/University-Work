// المادة: تراكيب البيانات
// الموضوع: Sorted List Implementation Using Arrays
// لغة البرمجة: Java

public class SortedList {
    private int max;
    private char[] array;
    private int last;

    // المشيد الافتراضي (Default Constructor)
    public SortedList() {
        this.max = 100;
        this.array = new char[max];
        this.last = -1;
    }

    // مشيد مع تحديد الحجم (Parameterized Constructor)
    public SortedList(int n) {
        this.max = n;
        this.array = new char[max];
        this.last = -1;
    }

    // إفراغ القائمة
    public void makeEmpty() {
        this.last = -1;
    }

    // الفحص إذا كانت القائمة فارغة
    public boolean isEmpty() {
        return (this.last == -1);
    }

    // الفحص إذا كانت القائمة ممتلئة
    public boolean isFull() {
        return (this.last == this.max - 1);
    }
}