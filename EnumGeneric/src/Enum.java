
import generic.Cell;
import generic.CellGeneric;
import generic.GenericMethodClass;

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
        AccountType account = AccountType.DEPOSIT;
        System.out.println(account);
//        System.out.println("Type: " + account.name()
//                            +"\nCode: " + account.getCode()
//                            +"\nRate: " + account.getRate());
    
        Cell cell = new Cell();
        cell.setValue("anna");
        //int x = (int) cell.getValue();
        System.out.println(cell.getValue());
        
        //generic
        CellGeneric<String> cell1 = new CellGeneric<>();
        cell1.setValue("5");
//        int y = (int) cell.getValue();
//        int y = (int) cell1.getValue();
        int y = Integer.parseInt(cell1.getValue());
        
        //generic method
        GenericMethodClass gmc = new GenericMethodClass();
        Integer[] integerArray = {1, 2, 3};
        String[] stringArray = {"This","is","fun"};
        
        gmc.printArray(integerArray);
        gmc.printArray(stringArray);
    }
}
