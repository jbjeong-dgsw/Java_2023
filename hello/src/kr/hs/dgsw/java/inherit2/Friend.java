package kr.hs.dgsw.java.inherit2;

import java.util.Objects;

public class Friend {
    private int age;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Friend)) {
            return false;
        }

        Friend friend = (Friend)obj;
        int differenceOfAge = Math.abs(this.age - friend.age);

        return (differenceOfAge < 10);
    }

}
