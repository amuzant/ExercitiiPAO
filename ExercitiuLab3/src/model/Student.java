package model;

public class Student extends Person {
    private int number;
    private float mark;
    private int classs;

    public Student(String name, String phone, String email, int number, float mark, int classs) {
        super(name,phone,email);
        this.number=number;
        this.mark=mark;
        this.classs=classs;
    }

    public int getNumber() {
        return number;
    }

    public float getMark() {
        return mark;
    }

    public int getClasss() {
        return classs;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public void setClasss(int classs) {
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "Student" +
                "\nName: " + getName() +
                "\nPhone number: " + getPhone() +
                "\nEmail: " + getEmail() +
                "\nStudent number: " + number +
                "\nAverage mark: " + mark +
                "\nClass: " + classs;
    }
}
