package org.example.repository;

import java.util.Date;

public class BoardVisitor {
    private String uniqueVisitorId;
    private Date visitDate;
    private String ip;
    private String visitPeriod;

    public BoardVisitor() {
    }

    public BoardVisitor(String uniqueVisitorId, Date visitDate, String ip, String visitPeriod) {
        this.uniqueVisitorId = uniqueVisitorId;
        this.visitDate = visitDate;
        this.ip = ip;
        this.visitPeriod = visitPeriod;
    }

    public String getUniqueVisitorId() {
        return uniqueVisitorId;
    }

    public void setUniqueVisitorId(String uniqueVisitorId) {
        this.uniqueVisitorId = uniqueVisitorId;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getVisitPeriod() {
        return visitPeriod;
    }

    public void setVisitPeriod(String visitPeriod) {
        this.visitPeriod = visitPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoardVisitor that = (BoardVisitor) o;

        if (!uniqueVisitorId.equals(that.uniqueVisitorId)) return false;
        if (!visitDate.equals(that.visitDate)) return false;
        if (!ip.equals(that.ip)) return false;
        return visitPeriod.equals(that.visitPeriod);
    }

    @Override
    public int hashCode() {
        int result = uniqueVisitorId.hashCode();
        result = 31 * result + visitDate.hashCode();
        result = 31 * result + ip.hashCode();
        result = 31 * result + visitPeriod.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "BoardVisitor{" +
                "uniqueVisitorId='" + uniqueVisitorId + '\'' +
                ", visitDate=" + visitDate +
                ", ip='" + ip + '\'' +
                ", visitPeriod='" + visitPeriod + '\'' +
                '}';
    }


}
