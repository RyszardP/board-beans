package org.example.repository;

import java.util.Date;

public class User {
    private String userName;
    private String userSecondName;
    private String userLogin;
    private String userEmail;
    private String userSubscriptionId;
    private String userRank;
    private String userId;
    private String userPlan;
    private String userBoard;
    private Date registrationDate;

    public User() {
    }

    public User(String userName, String userSecondName, String userLogin, String userEmail, String userSubscriptionId,
                String userRank, String userId, String userPlan, String userBoard, Date registrationDate) {
        this.userName = userName;
        this.userSecondName = userSecondName;
        this.userLogin = userLogin;
        this.userEmail = userEmail;
        this.userSubscriptionId = userSubscriptionId;
        this.userRank = userRank;
        this.userId = userId;
        this.userPlan = userPlan;
        this.userBoard = userBoard;
        this.registrationDate = registrationDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSecondName() {
        return userSecondName;
    }

    public void setUserSecondName(String userSecondName) {
        this.userSecondName = userSecondName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSubscriptionId() {
        return userSubscriptionId;
    }

    public void setUserSubscriptionId(String userSubscriptionId) {
        this.userSubscriptionId = userSubscriptionId;
    }

    public String getUserRank() {
        return userRank;
    }

    public void setUserRank(String userRank) {
        this.userRank = userRank;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPlan() {
        return userPlan;
    }

    public void setUserPlan(String userPlan) {
        this.userPlan = userPlan;
    }

    public String getUserBoard() {
        return userBoard;
    }

    public void setUserBoard(String userBoard) {
        this.userBoard = userBoard;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!userName.equals(user.userName)) return false;
        if (!userSecondName.equals(user.userSecondName)) return false;
        if (!userLogin.equals(user.userLogin)) return false;
        if (!userEmail.equals(user.userEmail)) return false;
        if (!userSubscriptionId.equals(user.userSubscriptionId)) return false;
        if (!userRank.equals(user.userRank)) return false;
        if (!userId.equals(user.userId)) return false;
        if (!userPlan.equals(user.userPlan)) return false;
        if (!userBoard.equals(user.userBoard)) return false;
        return registrationDate.equals(user.registrationDate);
    }

    @Override
    public int hashCode() {
        int result = userName.hashCode();
        result = 31 * result + userSecondName.hashCode();
        result = 31 * result + userLogin.hashCode();
        result = 31 * result + userEmail.hashCode();
        result = 31 * result + userSubscriptionId.hashCode();
        result = 31 * result + userRank.hashCode();
        result = 31 * result + userId.hashCode();
        result = 31 * result + userPlan.hashCode();
        result = 31 * result + userBoard.hashCode();
        result = 31 * result + registrationDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSecondName='" + userSecondName + '\'' +
                ", userLogin='" + userLogin + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userSubscriptionId='" + userSubscriptionId + '\'' +
                ", userRank='" + userRank + '\'' +
                ", userId='" + userId + '\'' +
                ", userPlan='" + userPlan + '\'' +
                ", userBoard='" + userBoard + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }


}
