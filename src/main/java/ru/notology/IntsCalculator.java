package ru.notology;

public class IntsCalculator implements Ints {
    protected final Calculator calculator;

    public IntsCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return calc(Calculator.Operation.SUM, arg0, arg1);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return calc(Calculator.Operation.MULT, arg0, arg1);
    }

    @Override
    public int pow(int arg0, int arg1) {
        return calc(Calculator.Operation.POW, arg0, arg1);
    }

    private int calc(Calculator.Operation operation, int a, int b) {

        Double result = calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(operation)
                .result();

        return result.intValue();
    }
}
