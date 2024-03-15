package service;

import model.Profesor;
import model.Student;

import java.util.ArrayList;

public class StorageService {
    private ArrayList<Profesor> profesors;
    private ArrayList<Student> students;

    public StorageService() {
        this.profesors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public Profesor findProfesor(String name)
    {
        for(Profesor p:profesors)
        {
            if (p.getName().equals(name))
            {
                return p;
            }
        }
        return null;
    }

    public Student findStudent(String name)
    {
        for(Student s:students)
        {
            if (s.getName().equals(name))
            {
                return s;
            }
        }
        return null;
    }

    public void addProfesor(Profesor profesor) {
        for(Profesor p: profesors)
            if(p.getName().equals(profesor.getName()))
            {
                System.out.println("Already existing");
                return;
            }
        profesors.add(profesor);
    }

    public void addStudent(Student student) {
        for(Student s: students)
            if(s.getName().equals(student.getName()))
            {
                System.out.println("Already existing");
                return;
            }
        students.add(student);
    }

    public void deleteStudent(String name)
    {
        for(Student s: students)
            if(s.getName().equals(name))
            {
                students.remove(s);
                System.out.println("Successfully deleted student "+name);
                return;
            }
    }

    public void deleteProfesor(String name)
    {
        for(Profesor p: profesors)
            if(p.getName().equals(name))
            {
                profesors.remove(p);
                System.out.println("Successfully deleted profesor "+name);
                return;
            }
    }

    public void updateProfesor(Profesor updatedProfesor)
    {
        for(Profesor p : profesors) {
            if(p.getName().equals(updatedProfesor.getName())) {
                p.setCourse(updatedProfesor.getCourse());
                p.setYear(updatedProfesor.getYear());
                p.setName(updatedProfesor.getName());
                p.setEmail(updatedProfesor.getEmail());
                p.setPhone(updatedProfesor.getPhone());
                return;
            }
        }
    }

    public void updateStudent(Student updatedStudent)
    {
        for(Student s : students) {
            if(s.getName().equals(updatedStudent.getName())) {
                s.setNumber(updatedStudent.getNumber());
                s.setClasss(updatedStudent.getClasss());
                s.setMark(updatedStudent.getMark());
                s.setName(updatedStudent.getName());
                s.setEmail(updatedStudent.getEmail());
                s.setPhone(updatedStudent.getPhone());
                return;
            }
        }
    }
}
