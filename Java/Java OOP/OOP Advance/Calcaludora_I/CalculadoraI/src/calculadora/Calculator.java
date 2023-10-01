package calculadora;

public class Calculator {
	    private double operandOne;
	    private double operandTwo;
	    private String operation;
	    private double result;

	    // Constructor
	    public Calculator() {
	        this.operandOne = 0.0;
	        this.operandTwo = 0.0;
	        this.operation = "";
	        this.result = 0.0;
	    }

	    // Setter methods
	    public void setOperandOne(double operandOne) {
	        this.operandOne = operandOne;
	    }

	    public void setOperandTwo(double operandTwo) {
	        this.operandTwo = operandTwo;
	    }

	    public void setOperation(String operation) {
	        this.operation = operation;
	    }

	    // Perform the operation
	    public void performOperation() {
	        switch (operation) {
	            case "+":
	                result = operandOne + operandTwo;
	                break;
	            case "-":
	                result = operandOne - operandTwo;
	                break;
	            default:
	                System.out.println("Operación no válida.");
	        }
	    }

	    // Get the result
	    public double getResult() {
	        return result;
	    }

	    public static void main(String[] args) {
	        Calculator calculator = new Calculator();
	        calculator.setOperandOne(10.5);
	        calculator.setOperation("+");
	        calculator.setOperandTwo(5.2);
	        calculator.performOperation();
	        double result = calculator.getResult();
	        System.out.println("El resultado es: " + result);
	    }
	}	
