/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @param <T>
 */
public class CellGeneric<T> {
    private T data;
        
        public void setValue(T celldata){
            data = celldata;
        }//end method setValue
        
        public T getValue() {
            return data;
        }//end method get
}
