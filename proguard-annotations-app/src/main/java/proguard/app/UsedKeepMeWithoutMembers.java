package proguard.app;

import proguard.annotation.*;

@Keep
public class UsedKeepMeWithoutMembers {

    private String mDontKeepMe;

    public String getDontKeepMe() {
        return mDontKeepMe;
    }

    public void setDontKeepMe(String s) {
        mDontKeepMe = s;
    }

    public String dontKeepMe;
}
