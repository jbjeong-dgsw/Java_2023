package kr.hs.dgsw.java;

public class Adder {

    int add(int operand1, int operand2) {
        int sum = operand1 + operand2;

        return sum;
    }

    int add(int op1, int op2, int op3){
        int sum = add(add(op1, op2), op3);

        return sum;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();

        int sum = adder.add(7894648, 4642165);
        System.out.println(sum);

        int sum2 = adder.add(456, 864, 123);
        System.out.println(sum2);
    }

}
