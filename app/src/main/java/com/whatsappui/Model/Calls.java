package com.whatsappui.Model;

public class Calls {

    private String contactCallNames;
    private String callsTimeStamp;

    public Calls() {
        this("John Doe", "06 February, 17:59");
    }

    public Calls(String contactCallNames, String callsTimeStamp) {
        this.contactCallNames = contactCallNames;
        this.callsTimeStamp = callsTimeStamp;
    }

    public String getContactCallNames() {
        return contactCallNames;
    }

    public void setContactCallNames(String contactCallNames) {
        this.contactCallNames = contactCallNames;
    }

    public String getCallsTimeStamp() {
        return callsTimeStamp;
    }

    public void setCallsTimeStamp(String callsTimeStamp) {
        this.callsTimeStamp = callsTimeStamp;
    }
}
