class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int)Math.pow(num1, num2);
    }
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
    public static void main(String[] args) {
        System.out.println("powerInt(2, 3) = " + powerInt(4, 5));       
        System.out.println("powerDouble(2.5, 3) = " + powerDouble(4.5, 5)); 
    }
}