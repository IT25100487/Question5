// ===== Question 5 =====
class Calculator {
    //a)  Add two integers
    int add(int a, int b) {
        return a + b;
    }
    
    //  b) Multiply two integers
    int multiply(int a, int b) {
        return a * b;
    }
    
    // c) Square an integer
    int square(int a) {
        return a * a;
    }
}

class MainCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calculate (3*4 + 5*7)^2
        int part1 = calc.multiply(3, 4);
        int part2 = calc.multiply(5, 7);
        int sum1 = calc.add(part1, part2);
        int result1 = calc.square(sum1);
        
        System.out.println("(3*4 + 5*7)^2 = " + result1);
        
        // Calculate (4 + 7)^2 + (8 + 3)^2
        int sum2 = calc.add(4, 7);
        int sum3 = calc.add(8, 3);
        int square1 = calc.square(sum2);
        int square2 = calc.square(sum3);
        int result2 = calc.add(square1, square2);
        
        System.out.println("(4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}

