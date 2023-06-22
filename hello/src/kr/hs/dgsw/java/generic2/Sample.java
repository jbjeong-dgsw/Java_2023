package kr.hs.dgsw.java.generic2;

import java.util.Date;

public class Sample<ZZZ> {
    private ZZZ value;

    public ZZZ getValue() {
        return value;
    }

    public void setValue(ZZZ value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Sample<String> sample1 = new Sample<String>();
        Sample<Integer> sample2 = new Sample<Integer>();

        sample1.setValue("대소고");
        sample2.setValue(1234);

        Sample<String> sample3 = sample1;

        Sample sample4 = new Sample();
        Sample<Object> sample5 = new Sample<Object>();


        Object obj1 = "Hello";
        Object obj2 = new Date();
        Object obj3 = 3;

        sample4.setValue("Hello");
        sample4.setValue(new Date());
        sample4.setValue(3);

        int length = ((String)obj1).length();
    }
}
