/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Linkedlist;

import java.util.LinkedList;

/**
 *
 * @author Hana Maheswari
 */
public class LettersStack {
    public static void main(String[] args) {
        LinkedList<String> letterS = new LinkedList<String>();
        letterS.push("A");
        letterS.push("B");
        letterS.push("C");
        letterS.push("D");
        
        //display the contents of the linked list
        System.out.println("Linked list : " + letterS);
        
        //display the size of the linked list
        System.out.println("Stack Size: " + letterS.size());
        
        //while the stack is not empty remove each element
        while(!letterS.isEmpty())
            System.out.println(letterS.pop());
            
        //display the contents of the linked list
        System.out.println("Linked list : " + letterS);
    }
    
}
