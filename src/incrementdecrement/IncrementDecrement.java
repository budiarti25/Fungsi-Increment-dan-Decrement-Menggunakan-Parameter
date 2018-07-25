/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementdecrement;

/**
 *
 * @author budiarti
 */
public class IncrementDecrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int panjang = 0;
        int maxno = 0;
        coba cb = new coba();
        fungsibaru fb=new fungsibaru();
        
        
       System.out.println(fb.Increment1(4, 150));
       System.out.println(fb.Decrement2(4, 1)); 
       System.out.println(cb.Increment1(4, 150));
       System.out.println(cb.Decrement2(4, 1));
    }
    
}
