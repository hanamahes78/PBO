/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompareTo;

import java.util.ArrayList;

/**
 *
 * @author Hana Maheswari
 */
public class Student {
    private ArrayList<String> studentNames = new ArrayList();
    static void displayStudents(ArrayList<Student> studentNames) {
        for(Student student: studentNames)
            System.out.println(student);
    }
    
    static void addStudents(ArrayList<Student> studentNames) {
    }
    
    public int compareTo(Student stud2) {
        if(lastName.compareTo(stud2.getLastName()) < 0 )
            return -1;
        if(lastName.compareTo(stud2.getLastName()) == 0 )
            return 0;
        return 1;
    }
}
