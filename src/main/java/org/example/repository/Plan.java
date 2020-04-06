package org.example.repository;

import java.util.Date;

public class Plan {
    private String planId;
    private String title;
    private String description;
    private Date dateCreated;
    private boolean active;

    public Plan() {
    }

    public Plan(String planId, String title, String description, Date dateCreated, boolean active) {
        this.planId = planId;
        this.title = title;
        this.description = description;
        this.dateCreated = dateCreated;
        this.active = active;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
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

        Plan plan = (Plan) o;

        if (active != plan.active) return false;
        if (!planId.equals(plan.planId)) return false;
        if (!title.equals(plan.title)) return false;
        if (!description.equals(plan.description)) return false;
        return dateCreated.equals(plan.dateCreated);
    }

    @Override
    public int hashCode() {
        int result = planId.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + dateCreated.hashCode();
        result = 31 * result + (active ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "planId='" + planId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateCreated=" + dateCreated +
                ", active=" + active +
                '}';
    }
}
