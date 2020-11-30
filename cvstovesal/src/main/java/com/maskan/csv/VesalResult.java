package com.maskan.csv;

import java.util.Date;
import java.util.List;

public class VesalResult {

    private List<Long> referenceId;
    private List<String> mobileNumber;
    private int errorId;
    private Date sendDate;

    public List<Long> getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(List<Long> referenceId) {
        this.referenceId = referenceId;
    }

    public List<String> getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(List<String> mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getErrorId() {
        return errorId;
    }

    public void setErrorId(int errorId) {
        this.errorId = errorId;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
