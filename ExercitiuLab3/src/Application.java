
import model.Profesor;
import model.Student;
import service.StorageService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StorageService storageService=new StorageService();
        while(true)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("================");
            System.out.println("Available commands:\n" +
                    "create\n" +
                    "read\n" +
                    "update\n" +
                    "delete\n" +
                    "quit");

            System.out.println("Enter command:");
            String cmd=scanner.nextLine();
            System.out.println("Command received: "+cmd);

            if (cmd.toLowerCase().contains("create")) {
                System.out.println("Enter type of person: ");
                String type = scanner.nextLine();
                if (type.toLowerCase().contains("student")) {
                    System.out.println("Creating a new Student");
                    System.out.println("Name: ");
                    String name=scanner.nextLine();
                    System.out.println("Phone number: ");
                    String phone=scanner.nextLine();
                    System.out.println("Email: ");
                    String email=scanner.nextLine();
                    System.out.println("Student number: ");
                    int number=scanner.nextInt();
                    System.out.println("Average mark: ");
                    float mark=scanner.nextFloat();
                    System.out.println("Class: ");
                    int classs=scanner.nextInt();
                    Student student = new Student(name,phone,email,number,mark,classs);
                    storageService.addStudent(student);
                } else if (type.toLowerCase().contains("profesor")) {
                    System.out.println("Creating a new Profesor");
                    System.out.println("Name:");
                    String name=scanner.nextLine();
                    System.out.println("Phone number:");
                    String phone=scanner.nextLine();
                    System.out.println("Email:");
                    String email=scanner.nextLine();
                    System.out.println("Course:");
                    String course=scanner.nextLine();
                    System.out.println("Year:");
                    Integer year=scanner.nextInt();
                    Profesor profesor = new Profesor(name,phone,email,course,year);
                    storageService.addProfesor(profesor);
                }
            }
            else if (cmd.toLowerCase().contains("read"))
            {
                System.out.println("Name:");
                String name=scanner.nextLine();
                Profesor prof=storageService.findProfesor(name);
                Student stud=storageService.findStudent(name);

                if(prof==null && stud==null)
                {
                    System.out.println("Not existing");
                }
                if(prof!=null)
                {
                    System.out.println(prof);
                }
                if(stud!=null)
                {
                    System.out.println(stud);
                }

            }
            else if (cmd.toLowerCase().contains("update"))
            {
                System.out.println("Name:");
                String name=scanner.nextLine();

                Profesor prof=storageService.findProfesor(name);
                Student stud=storageService.findStudent(name);

                if(prof==null && stud==null)
                {
                    System.out.println("Not existing");
                }
                else if(stud!=null && prof!=null)
                {
                    System.out.println("Found a student and a profesor. Type 's' to update the Student, 'p' to update the Profesor:");
                    char decision=scanner.nextLine().toLowerCase().charAt(0);
                    if(decision=='s')
                    {
                        System.out.println("Found student " + name + ", updating their profile:");
                        System.out.println("Phone number: ");
                        String phone=scanner.nextLine();
                        System.out.println("Email: ");
                        String email=scanner.nextLine();
                        System.out.println("Student number: ");
                        int number=scanner.nextInt();
                        System.out.println("Average mark: ");
                        float mark=scanner.nextFloat();
                        System.out.println("Class: ");
                        int classs=scanner.nextInt();
                        Student student = new Student(name,phone,email,number,mark,classs);
                        storageService.updateStudent(student);
                    }
                    if(decision=='t')
                    {
                        System.out.println("Found teacher " + name + ", updating their profile:");
                        System.out.println("Phone number:");
                        String phone=scanner.nextLine();
                        System.out.println("Email:");
                        String email=scanner.nextLine();
                        System.out.println("Course:");
                        String course=scanner.nextLine();
                        System.out.println("Year:");
                        Integer year=scanner.nextInt();
                        Profesor profesor = new Profesor(name,phone,email,course,year);
                        storageService.updateProfesor(profesor);
                    }
                }
                else if(stud!=null)
                {
                    System.out.println("Found student " + name + ", updating their profile:");
                    System.out.println("Phone number: ");
                    String phone=scanner.nextLine();
                    System.out.println("Email: ");
                    String email=scanner.nextLine();
                    System.out.println("Student number: ");
                    int number=scanner.nextInt();
                    System.out.println("Average mark: ");
                    float mark=scanner.nextFloat();
                    System.out.println("Class: ");
                    int classs=scanner.nextInt();
                    Student student = new Student(name,phone,email,number,mark,classs);
                    storageService.updateStudent(student);
                }
                else if(prof!=null)
                {
                    System.out.println("Found teacher " + name + ", updating their profile:");
                    System.out.println("Phone number:");
                    String phone=scanner.nextLine();
                    System.out.println("Email:");
                    String email=scanner.nextLine();
                    System.out.println("Course:");
                    String course=scanner.nextLine();
                    System.out.println("Year:");
                    Integer year=scanner.nextInt();
                    Profesor profesor = new Profesor(name,phone,email,course,year);
                    storageService.updateProfesor(profesor);
                }
            }
            else if (cmd.toLowerCase().contains("delete"))
            {
                System.out.println("Name:");
                String name=scanner.nextLine();
                Profesor prof=storageService.findProfesor(name);
                Student stud=storageService.findStudent(name);

                if(prof==null && stud==null)
                {
                    System.out.println("Not existing");
                }
                else if(stud!=null && prof!=null)
                {
                    System.out.println("Found a student and a profesor. Type 's' to delete the Student, 'p' to delete the Profesor:");
                    char decision=scanner.nextLine().toLowerCase().charAt(0);
                    if(decision=='s')
                    {
                        storageService.deleteStudent(name);
                    }
                    if(decision=='t')
                    {
                        storageService.deleteProfesor(name);
                    }
                }
                else if (prof!=null) {
                    storageService.deleteProfesor(name);
                }
                else if(stud!=null)
                {
                    storageService.deleteStudent(name);
                }

            }
            else if(cmd.toLowerCase().contains("quit"))
            {
                break;
            }
        }
    }
}
