package kr.hs.dgsw.java.generic4;

import java.util.Date;

public class Sample<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Sample<String> sample1 = new Sample<String>();
        sample1.setValue("Korea");;
        System.out.println(sample1.getValue());

        Sample<Integer> sample2 = new Sample<Integer>();
        sample2.setValue(3);
        //sample2.setValue("Korea");

        Sample sample3 = new Sample();
        sample3.setValue("Korea");
        sample3.setValue(new Date());

        sample3.setValue(5);

        Date date = (Date)sample3.getValue();
    }
}
