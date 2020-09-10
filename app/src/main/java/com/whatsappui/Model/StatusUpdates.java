package com.whatsappui.Model;

public class StatusUpdates {
    private String contactNames;
    private String timeStamp;
    private String imageUri;

    public StatusUpdates() {
        this("John Doe", "Today 00:00", "");
    }

    public StatusUpdates(String contactNames, String timeStamp) {
        this.contactNames = contactNames;
        this.timeStamp = timeStamp;
    }

    public StatusUpdates(String contactNames, String timeStamp, String imageUri) {
        this.contactNames = contactNames;
        this.timeStamp = timeStamp;
        this.imageUri = imageUri;
    }

    public String getContactNames() {
        return contactNames;
    }

    public void setContactNames(String contactNames) {
        this.contactNames = contactNames;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
