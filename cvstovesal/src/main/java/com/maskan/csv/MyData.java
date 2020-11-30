package com.maskan.csv;

import java.util.Date;

public class MyData {
    private Date time;
    private int percentage;
    private String outStr;

    public MyData(Date time, String outStr, int percentage) {
        this.time = time;
        this.outStr = outStr;
        this.percentage = percentage;

    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOutStr() {
        return outStr;
    }

    public void setOutStr(String outStr) {
        this.outStr = outStr;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
