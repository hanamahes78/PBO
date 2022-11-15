/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CompareTo;

/**
 *
 * @author Hana Maheswari
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.addStudents("Mark", "Mywords", 95);
        student.addStudents("Andrew", "Apic", 45);
        student.displayStudents();

        Collections.sort(studentNames);
        student.displayStudents();
    }
}
