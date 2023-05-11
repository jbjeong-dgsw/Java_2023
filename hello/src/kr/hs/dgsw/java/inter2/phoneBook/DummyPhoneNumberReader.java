package kr.hs.dgsw.java.inter2.phoneBook;

public class DummyPhoneNumberReader implements PhoneNumberReader {

    @Override
    public String read(String name) throws Exception {
        if ("천수인".equals(name)) {
            return "010-1234-568";
        } else if ("정규민".equals(name)) {
            return "010-9999-8888";
        } else {
            throw new Exception();
        }
    }
}
