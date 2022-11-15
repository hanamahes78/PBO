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
public class LettersQueue {
    public static void main(String[] args) {
        LinkedList<String> lettersQ = new LinkedList<String>();
        lettersQ.add("A");
        lettersQ.add("B");
        lettersQ.add("C");
        lettersQ.add("D");
        
        //display the contents of the linked list
        System.out.println("Linked list : " + lettersQ);
        
        //display the size of the linked list
        System.out.println("Queue Size: " + lettersQ.size());
        
        //while the Queue is not empty remove each element
        while(!lettersQ.isEmpty())
            System.out.println(lettersQ.removeFirst());
        
        //display the contents of the linked list
        System.out.println("Linked list : " + lettersQ);
    }
    
}
