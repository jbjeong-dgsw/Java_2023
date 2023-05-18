package kr.hs.dgsw.java.list2;

public interface List {
    // 추가
    public void add(String value);

    // 삭제
    public void remove(int index);

    // 읽기
    public String get(int index);

    // 크기
    public int size();

}
