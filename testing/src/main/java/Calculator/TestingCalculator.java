package Calculator;

public class TestingCalculator {
    public static void main(String[] args) {
        Calculator calculator= new Calculator(5,3);

        //test of method add()
        int resultOfAdding = calculator.getA() + calculator.getB();
        if(resultOfAdding == calculator.add(calculator.getA(), calculator.getB())){
            System.out.println("test OK");
        } else {
            System.out.println("error!");
        }

        int resultOfSubtracting = calculator.getA() - calculator.getB();

    }
}
