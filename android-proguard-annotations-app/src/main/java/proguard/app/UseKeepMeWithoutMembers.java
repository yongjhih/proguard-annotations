package proguard.app;

import proguard.annotation.*;

@Keep
public class UseKeepMeWithoutMembers {
    UseKeepMeWithoutMembers() {
        UsedKeepMeWithoutMembers obj = new UsedKeepMeWithoutMembers();
        obj.getDontKeepMe();
        //obj.setDontKeepMe(null);
        obj.dontKeepMe = null;
    }

    private String mDontKeepMe;

    public String getDontKeepMe() {
        return mDontKeepMe;
    }

    public void setDontKeepMe(String s) {
        mDontKeepMe = s;
    }

    public String dontKeepMe;
}
