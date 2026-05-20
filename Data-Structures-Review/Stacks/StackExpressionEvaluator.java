// المادة: تراكيب البيانات
// الموضوع: Postfix Expression Evaluation using Stack
// لغة البرمجة: Java & Pseudo-code

/*
Algorithm for Postfix Evaluation:
---------------------------------
ch = first character from expression
while (ch != '#') {
    if (ch is Operand)
        push its value on the stack
    else if (ch is Unary Operator) {
        pop one value from stack
        apply operator to popped value
        push result on stack
    } 
    else if (ch is Binary Operator) {
        pop two values from stack
        apply operator to popped values (lower operator higher)
        push result on stack
    }
    ch = next character from expression
}
Pop final result from stack
end Algorithm
*/

public class StackExpressionEvaluator {

    // دالة تقييم المعاملات الأحادية (Unary Operators)
    public int evaluate1(int v, char ch) {
        switch(ch) {
            case '!': 
                return (v == 0) ? 1 : 0; // تم تعديلها لتوافق شروط القيم المنطقية بالـ Stack كأرقام
            default:
                return 0;
        }
    }

    // دالة تقييم المعاملات الثنائية (Binary Operators)
    public int evaluate2(int v1, int v2, char ch) {
        switch(ch) {
            case '+': 
                return (v1 + v2);
            case '-': 
                return (v1 - v2);
            case '*': 
                return (v1 * v2);
            case '/': 
                return (v1 / v2);
            case '>': 
                return (v1 > v2) ? 1 : 0;
            case '<': 
                return (v1 < v2) ? 1 : 0;
            default: 
                return 0;
        }
    }

    // دالة الفحص إن كان المعامل أحادياً
    public boolean isUnaryOperator(char ch) {
        if (ch == '!') {
            return true;
        } else {
            return false;
        }
    }

    // دالة الفحص إن كان المعامل ثنائياً
    public boolean isBinOperator(char ch) {
        if (ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '>' || ch == '<') {
            return true;
        } else {
            return false;
        }
    }
}