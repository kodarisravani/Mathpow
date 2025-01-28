public class MathPow {
        public static void main(String[] args) {
            // Example 1: Calculate 2^3
            double base = 2;
            double exponent = 3;
            double result = Math.pow(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " is " + result);
    
            // Example 2: Calculate 5^2
            base = 5;
            exponent = 2;
            result = Math.pow(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " is " + result);
    
            // Example 3: Calculate 10^0
            base = 10;
            exponent = 0;
            result = Math.pow(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " is " + result);
    
            // Example 4: Calculate 2^-3
            base = 2;
            exponent = -3;
            result = Math.pow(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " is " + result);
        }
    }