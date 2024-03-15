package model;

public class Profesor extends Person
{
    private String course;
    private int year;

    public Profesor(String name, String phone, String email, String course, Integer year) {
        super(name,phone,email);
        this.course=course;
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Profesor" +
                "\nName: " + getName() +
                "\nPhone number: " + getPhone() +
                "\nEmail: " + getEmail() +
                "\nCourse: " + course +
                "\nYear: " + year;
    }
}