package org.example.repository;

public class Rank {
    private String student;
    private String teacher;
    private String agency;

    public Rank() {
    }

    public Rank(String student, String teacher, String agency) {
        this.student = student;
        this.teacher = teacher;
        this.agency = agency;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rank rank = (Rank) o;

        if (!student.equals(rank.student)) return false;
        if (!teacher.equals(rank.teacher)) return false;
        return agency.equals(rank.agency);
    }

    @Override
    public int hashCode() {
        int result = student.hashCode();
        result = 31 * result + teacher.hashCode();
        result = 31 * result + agency.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "student='" + student + '\'' +
                ", teacher='" + teacher + '\'' +
                ", agency='" + agency + '\'' +
                '}';
    }
}
