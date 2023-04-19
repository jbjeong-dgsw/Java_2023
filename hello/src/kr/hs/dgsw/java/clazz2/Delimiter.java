package kr.hs.dgsw.java.clazz2;

public class Delimiter {
    public String value1;

    private String value2;

    String value3;

    public void print() {
        subPrint();
    }

    private void subPrint() {

    }

    public static void main(String[] args) {
        Delimiter object = new Delimiter();
        object.value1 = "Mountain";
        object.value2 = "Sea";
        object.value3 = "House";
    }
}
