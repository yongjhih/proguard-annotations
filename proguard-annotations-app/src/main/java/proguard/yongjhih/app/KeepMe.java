package proguard.yongjhih.app;

import proguard.annotation.*;

@Keep
@KeepClassMembers
public class KeepMe {

    private String mKeepMe;

    public String getKeepMe() {
        return mKeepMe;
    }

    public void setKeepMe(String s) {
        mKeepMe = s;
    }

    public String keepMe;
}
