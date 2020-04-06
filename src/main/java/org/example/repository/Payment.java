package org.example.repository;

import java.util.Date;

public class Payment {
    private String paymentId;
    private String planId;
    private String payment;
    private Date paymentDate;
    private String description;

    public Payment() {
    }

    public Payment(String paymentId, String planId, String payment, Date paymentDate, String description) {
        this.paymentId = paymentId;
        this.planId = planId;
        this.payment = payment;
        this.paymentDate = paymentDate;
        this.description = description;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment1 = (Payment) o;

        if (!paymentId.equals(payment1.paymentId)) return false;
        if (!planId.equals(payment1.planId)) return false;
        if (!payment.equals(payment1.payment)) return false;
        if (!paymentDate.equals(payment1.paymentDate)) return false;
        return description.equals(payment1.description);
    }

    @Override
    public int hashCode() {
        int result = paymentId.hashCode();
        result = 31 * result + planId.hashCode();
        result = 31 * result + payment.hashCode();
        result = 31 * result + paymentDate.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", planId='" + planId + '\'' +
                ", payment='" + payment + '\'' +
                ", paymentDate=" + paymentDate +
                ", description='" + description + '\'' +
                '}';
    }
}
