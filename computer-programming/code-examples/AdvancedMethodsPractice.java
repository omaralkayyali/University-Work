public class AdvancedMethodsPractice {

    public static void modifyPrimitive(int value) {
        value = value * 5;
    }

    public static void modifyArrayReference(int[] targetArray) {
        for (int i = 0; i < targetArray.length; i++) {
            targetArray[i] = targetArray[i] * 2;
        }
    }

    public static double computeArea(double squareSide) {
        return squareSide * squareSide;
    }

    public static double computeArea(double baseLength, double crossWidth) {
        return baseLength * crossWidth;
    }

    public static void main(String[] args) {
        int originalValue = 10;
        modifyPrimitive(originalValue);
        System.out.println("Value after test: " + originalValue); 

        int[] structuralData = {2, 4, 6};
        modifyArrayReference(structuralData);
        System.out.print("Array elements after validation check: ");
        for (int element : structuralData) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Method Overload 1 (Square): " + computeArea(5.0));
        System.out.println("Method Overload 2 (Rectangle): " + computeArea(5.0, 8.0));
    }
}