
import model.Profesor;
import model.Student;
import service.StorageService;

import java.util.Scanner;

public class Application {
    private static StorageService storageService=new StorageService();
    private static Scanner scanner=new Scanner(System.in);

    public static void printCommands()
    {
        System.out.println("Available commands:\n" +
                "create\n" +
                "read\n" +
                "update\n" +
                "delete\n" +
                "quit");
        System.out.println("================");
    }
    public static void readCommands()
    {
        System.out.println("Enter command:");
        String cmd=scanner.nextLine().toLowerCase();
        System.out.println("Command received: "+cmd);
        if(cmd.equals("create"))
        {
            createPerson();
        }
        else if(cmd.equals("read"))
        {
            readPerson();
        }
        else if(cmd.equals("update"))
        {
            updatePerson();
        }
        else if(cmd.equals("delete"))
        {
            deletePerson();
        }
        else if(cmd.equals("quit"))
        {
            System.exit(0);
        }
    }

    private static void deletePerson() {
        System.out.println("Name:");
        String name=scanner.nextLine();
        Profesor prof=storageService.findProfesor(name);
        Student stud=storageService.findStudent(name);

        if(prof==null && stud==null)
        {
            System.out.println("Not existing");
        }
        else if(stud!=null && prof!=null) {
            System.out.println("Found a student and a profesor. Type 's' to delete the Student, 'p' to delete the Profesor:");
            char decision = scanner.nextLine().toLowerCase().charAt(0);
            if (decision == 's') {
                storageService.deleteStudent(name);
            }
            if (decision == 'p') {
                storageService.deleteProfesor(name);
            }
        }
        else if(stud!=null)
        {
            storageService.deleteStudent(name);
        }
        else if(prof!=null)
        {
            storageService.deleteProfesor(name);
        }
    }

    private static void updatePerson() {
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
                readStudent("update",name);
            }
            if(decision=='p')
            {
                System.out.println("Found teacher " + name + ", updating their profile:");
                readProfesor("update",name);
            }
        }
        else if(stud!=null)
        {
            readStudent("update",name);
        }
        else if(prof!=null)
        {
            readProfesor("update",name);
        }
    }

    private static void readPerson() {
        System.out.println("Name:");
        String name=scanner.nextLine();
        storageService.readPerson(name);
    }

    private static void createPerson() {
        System.out.println("Enter type of person (Student/Profesor): ");
        String type = scanner.nextLine().toLowerCase();
        if (type.equals("student")) {
            System.out.println("Creating a new Student");
            System.out.println("Name: ");
            String name=scanner.nextLine();
            readStudent("create",name);
        }
        else if(type.equals("profesor"))
        {
            System.out.println("Creating a new Profesor");
            System.out.println("Name:");
            String name=scanner.nextLine();
            readProfesor("create",name);
        }
    }

    private static void readProfesor(String operation,String name) {
        System.out.println("Phone number:");
        String phone=scanner.nextLine();
        System.out.println("Email:");
        String email=scanner.nextLine();
        System.out.println("Course:");
        String course=scanner.nextLine();
        System.out.println("Year:");
        Integer year=scanner.nextInt();
        Profesor profesor = new Profesor(name,phone,email,course,year);
        if(operation.equals("create"))
            storageService.addProfesor(profesor);
        else if(operation.equals("update"))
            storageService.updateProfesor(profesor);
    }

    public static void readStudent(String operation,String name) {
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
        if(operation.equals("create"))
            storageService.addStudent(student);
        else if(operation.equals("update"))
            storageService.updateStudent(student);
    }

    public static void main(String[] args) {

        while(true)
        {
            //print and read commands
            //if for each command
            //function for each command in storageservice

            printCommands();
            readCommands();
        }
    }
}
