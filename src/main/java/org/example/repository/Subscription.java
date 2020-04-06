package org.example.repository;

import java.util.Date;

public class Subscription {
    private String subscriptionId;
    private String planId;
    private String payment;
    private Date dateStart;
    private Date dateFinish;
    private boolean active;

    public Subscription() {
    }

    public Subscription(String subscriptionId, String planId, String payment, Date dateStart, Date dateFinish,
                        boolean active) {
        this.subscriptionId = subscriptionId;
        this.planId = planId;
        this.payment = payment;
        this.dateStart = dateStart;
        this.dateFinish = dateFinish;
        this.active = active;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscription that = (Subscription) o;

        if (active != that.active) return false;
        if (!subscriptionId.equals(that.subscriptionId)) return false;
        if (!planId.equals(that.planId)) return false;
        if (!payment.equals(that.payment)) return false;
        if (!dateStart.equals(that.dateStart)) return false;
        return dateFinish.equals(that.dateFinish);
    }

    @Override
    public int hashCode() {
        int result = subscriptionId.hashCode();
        result = 31 * result + planId.hashCode();
        result = 31 * result + payment.hashCode();
        result = 31 * result + dateStart.hashCode();
        result = 31 * result + dateFinish.hashCode();
        result = 31 * result + (active ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "subscriptionId='" + subscriptionId + '\'' +
                ", planId='" + planId + '\'' +
                ", payment='" + payment + '\'' +
                ", dateStart=" + dateStart +
                ", dateFinish=" + dateFinish +
                ", active=" + active +
                '}';
    }
}
