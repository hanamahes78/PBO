/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Hana Maheswari
 */
public class Enum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AccountType a1 = AccountType.SAVINGS;
        System.out.println(a1);
        
        AccountType account = AccountType.DEPOSIT;
        System.out.println(account);
//        System.out.println("Type: " + account.name()
//                            +"\nCode: " + account.getCode()
//                            +"\nRate: " + account.getRate());
    }
}
