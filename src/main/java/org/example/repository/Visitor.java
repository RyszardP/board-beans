package org.example.repository;

import java.util.Date;

public class Visitor {
    private String uniqueVisitorId;
    private String title;
    private Date lastVisitDate;
    private Date createDate;

    public Visitor() {
    }

    public Visitor(String uniqueVisitorId, String title, Date lastVisitDate, Date createDate) {
        this.uniqueVisitorId = uniqueVisitorId;
        this.title = title;
        this.lastVisitDate = lastVisitDate;
        this.createDate = createDate;
    }

    public String getUniqueVisitorId() {
        return uniqueVisitorId;
    }

    public void setUniqueVisitorId(String uniqueVisitorId) {
        this.uniqueVisitorId = uniqueVisitorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(Date lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Visitor visitor = (Visitor) o;

        if (!uniqueVisitorId.equals(visitor.uniqueVisitorId)) return false;
        if (!title.equals(visitor.title)) return false;
        if (!lastVisitDate.equals(visitor.lastVisitDate)) return false;
        return createDate.equals(visitor.createDate);
    }

    @Override
    public int hashCode() {
        int result = uniqueVisitorId.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + lastVisitDate.hashCode();
        result = 31 * result + createDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "uniqueVisitorId='" + uniqueVisitorId + '\'' +
                ", title='" + title + '\'' +
                ", lastVisitDate=" + lastVisitDate +
                ", createDate=" + createDate +
                '}';
    }
}
