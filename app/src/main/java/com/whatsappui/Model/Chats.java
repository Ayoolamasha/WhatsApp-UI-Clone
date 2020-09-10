package com.whatsappui.Model;

public class Chats {
    private String users;
    private String lastMessage;
    private boolean isOnline;
    private String phoneNumber;
    private String ImageUri;

    public Chats() {
        this("John Doe", "Some Dummy Text", true, "08122307048", "");
    }

    public Chats(String users, String lastMessage) {
        this.users = users;
        this.lastMessage = lastMessage;
    }

    public Chats(String users, String lastMessage, String imageUri) {
        this.users = users;
        this.lastMessage = lastMessage;
        ImageUri = imageUri;
    }

    public Chats(String users, boolean isOnline, String imageUri) {
        this.users = users;
        this.isOnline = isOnline;
        ImageUri = imageUri;
    }

    public Chats(String users, String lastMessage, boolean isOnline, String phoneNumber, String imageUri) {
        this.users = users;
        this.lastMessage = lastMessage;
        this.isOnline = isOnline;
        this.phoneNumber = phoneNumber;
        ImageUri = imageUri;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUri() {
        return ImageUri;
    }

    public void setImageUri(String imageUri) {
        ImageUri = imageUri;
    }


}
