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
public class fungsibaru {
   /**
     * Fungsi Decrement dengan panjang karakter ditentukan
     * @param panjang bertipe integer untuk menentukan panjang karakter yang akan ditampilkan
     * @param minimal bertipe integer nilai minimal yg akan ditampilkan
     * @param maksimal bertipe integer nilai maksimal yang akan ditampilkan
     * @return hasil berupa tampilan nilai decrement dengan panjang karakter ditentukan dan letak nilainya menyesuaikan posisi karakter
     */
    public String Decrement2(int panjang, int minimal, int maksimal) {
        String huruf1 = "";
        String hasil1 = "";
        int a=panjang;
        int i = maksimal;
        int j = 0;
        while (i >= minimal) {
            j=1; huruf1="";
            if (i > 99) {
              a=panjang-2;
            }else if (i > 9) {
               a=panjang-1;
            } else {
                a=panjang;
            }
            while (j < a) {
                    huruf1 += '0';
                    j++;
                }
                hasil1 += huruf1 + i + "\n";
            i--;
        }
        return hasil1;
    }
    
    /**
     * Fungsi Increment dengan panjang karakter ditentukan
     * @param pjg bertipe integer untuk menentukan panjang karakter yang akan ditampilkan
     * @param maksimal bertipe integer untuk menentukan nilai maksimal yang akan di tampilkan
     * @param minimal bertipe integer untuk menentukan nilai minimal yang akan di tampilkan
     * @return hasil berupa tampilan nilai increment dengan panjang karakter ditentukan dan letak nilainya menyesuaikan posisi karakter
     */
    public String Increment1(int pjg, int maksimal, int minimal) {
        String huruf = "";
        String hasil = "";
        int a = pjg;
        int i = minimal;
        int j = 1;
        while (i <= maksimal) {
            j=1; huruf="";
            if (i > 99) {
              a=pjg-2;
            }else if (i > 9) {
               a=pjg-1;
            } else {
                a=pjg;
            }
            while (j < a) {
                    huruf += '0';
                    j++;
                }
                hasil += huruf + i + "\n";
            i++;
        }
        return hasil;
    }
 
}
