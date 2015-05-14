package proguard.annotation.app;

import proguard.annotation.*;

@Keep
@KeepClassMembers
public class KeepMe {

    private String mDontKeepMe;

    public String getDontKeepMe() {
        return mDontKeepMe;
    }

    public void setDontKeepMe(String s) {
        mDontKeepMe = s;
    }

    public String dontKeepMe;
}
