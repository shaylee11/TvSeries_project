package com.example.tvproject;

public class Model {
    private int profileImage;
    private String userName;
    private String userDesc;

    public Model(int profileImage, String userName, String userDesc) {
        this.profileImage = profileImage;
        this.userName = userName;
        this.userDesc = userDesc;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }
}
