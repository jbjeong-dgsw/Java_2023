package kr.hs.dgsw.java.inter2.phoneBook;

public interface PhoneNumberReader {
    /**
     * 주어진 이름에 부합하는 전화번호를 반환한다.
     *
     * @param name 이름
     * @return 전화번호
     * @throws Exception 존재하지 않는 이름일 경우에 발생한다.
     */
    public String read(String name) throws Exception;

}
