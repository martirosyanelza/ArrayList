import java.util.Scanner;
public class Enum {
    public enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    static Scanner scanner = new Scanner(System.in);

    static double firstNumber;
    static double secondNumber;
    static String operator;
    static double answer;



    public static void main(String[] args) {
        initializeFirstNumber();
        initializeSecondNumber();
        calculate();
        recognizeInvalidOperators();
    }

    public static void initializeFirstNumber() {
        System.out.println("please enter first number:");
        firstNumber = scanner.nextDouble();
    }

    public static void initializeSecondNumber() {
        System.out.println("please enter second number");
        secondNumber = scanner.nextDouble();
    }

    public static void recognizeInvalidOperators() {
        operator = "";
        while (!(operator.equals("+")) || !(operator.equals("-")) || !(operator.equals("*")) || !(operator.equals("/"))) {
            System.out.println("please enter operators + or - or * or / ");
            operator = scanner.next();
            detectOperation(operator);
            break;
        }

    }
    public static void calculate(Operation operation) {
        switch(operation){
            case ADD:
                answer = (firstNumber + secondNumber);
                System.out.println("answer is:" + answer);
                break;
            case SUBTRACT:
                answer = (firstNumber - secondNumber);
                System.out.println("answer is:" + answer);
                break;
            case MULTIPLY:
                answer = (firstNumber * secondNumber);
                System.out.println("answer is:" + answer);
                break;
            case DIVIDE:
                answer = (firstNumber / secondNumber);
                System.out.println("answer is:" + answer);
                break;
        }

    }
    public static void detectOperation(String operator){// es pahy chem haskanum vonc anem vor konkret "operator"-i veragrem hamapatasxan goscoxutyun
        if (operator.equals("+")) {
            Operation myOp =  Operation.ADD;
            myOp.calculate();
        }
        if (operator.equals("-")) {
            Operation myOp = Operation.SUBTRACT;
            myOp.calculate();
        }
        if (operator.equals("*")) {
            Operation myOp = Operation.MULTIPLY;
            myOp.calculate();
        }
        if (operator.equals("/")) {
            Operation myOp = Operation.DIVIDE;
            myOp.calculate();
        }
    }
}


