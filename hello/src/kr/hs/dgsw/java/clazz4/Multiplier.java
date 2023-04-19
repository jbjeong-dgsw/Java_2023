package kr.hs.dgsw.java.clazz4;

public class Multiplier {
    private int operand1;
    private int operand2;

    public void setOperand1(int operand) {
        this.operand1 = operand;
    }

    public void setOperand2(int operand) {
        this.operand2 = operand;
    }

    public void showResult() {
        // 표준 출력 장치로도  3 * 4 = 12 라고 출력한다.
        System.out.printf("%d * %d = %d", operand1, operand2,
                calculate());
    }

    private int calculate() {
        int result = 0;
        for(int i = 0; i < operand2; i++){
            result += operand1;
        }

        return result;
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        multiplier.setOperand1(5);
        multiplier.setOperand2(3);
        multiplier.showResult();    // 5 * 3 = 15 출력
    }

}
