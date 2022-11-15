/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CollectionList;

/**
 *
 * @author Hana Maheswari
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.addStudents("Mark",-1);
        student.addStudents("Andrew",-1);
        student.displayStudents();
        
        student.addStudents("Beth",1);
        student.displayStudents();
    }
}
