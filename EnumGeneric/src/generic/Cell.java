/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author Hana Maheswari
 */
public class Cell {
        private Object data;
        
        public void setValue(Object celldata){
            data = celldata;
        }//end method setValue
        
        public Object getValue() {
            return data;
        }//end method get
}//end class Cell
