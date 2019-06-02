package Calculator;

public class TestingCalculator {
    public static void main(String[] args) {
        Calculator calculator= new Calculator(5,3);

        int resultOfAdding = calculator.getA() + calculator.getB();
        int resultOfSubtracting = calculator.getA() - calculator.getB();
    }
}
