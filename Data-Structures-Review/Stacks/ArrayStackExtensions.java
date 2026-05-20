// المادة: تراكيب البيانات (أسئلة الامتحانات النصفية)
// الموضوع: Array Implementation of Stack - Function size()
// لغة البرمجة: Java

public class ArrayStackExtensions {
    // بفرض أن المكدس يحتوي على المتغير top الذي يشير إلى الفهرس الحالي لأعلى المكدس
    private int top; 

    /**
     * دالة getSize() أو size() لإرجاع عدد العناصر الحالية داخل المكدس.
     * بفرض أن المصفوفة تبدأ من الفهرس 0، والمكدس الفارغ يُمثّل بقيمة top = -1
     */
    public int size() {
        return top + 1;
    }
    
    // صيغة أخرى بناءً على نمط تسمية الأسئلة
    public int getSize() {
        return top + 1;
    }
}