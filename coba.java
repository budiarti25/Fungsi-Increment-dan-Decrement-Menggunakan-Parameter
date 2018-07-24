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
public class coba {
    /**
     * Fungsi Decrement dengan panjang karakter ditentukan
     * @param panjang bertipe integer untuk menentukan panjang karakter yang akan ditampilkan
     * @param minno bertipe integer nilai minimal yg akan ditampilkan
     * @return hasil berupa tampilan nilai decrement dengan panjang karakter ditentukan dan letak nilainya menyesuaikan posisi karakter
     */
    public String Decrement2(int panjang, int minno) {
        String huruf1 = "";
        String hasil1 = "";
        int i = 150;
        int j = 0;
        while (i >= minno) {
            j=1; huruf1="";
            if (i > 99) {
                while (j < panjang-2) {
                    huruf1 = huruf1 + '0';
                    j++;
                }
                hasil1 += huruf1 + i + "\n";
            }else if (i > 9) {
                while (j < panjang-1) {
                    huruf1 = huruf1 + '0';
                    j++;
                }
                hasil1 += huruf1 + i + "\n";
            } else {
                while (j < (panjang)) {
                    huruf1 = huruf1 + '0';
                    j++;
                }
                hasil1 += huruf1 + i + "\n";
            }
            i--;
        }
        return hasil1;
    }
    
    /**
     * Fungsi Increment dengan panjang karakter ditentukan
     * @param pjg bertipe integer untuk menentukan panjang karakter yang akan ditampilkan
     * @param mxno bertipe integer untuk menentukan nilai maksimal yang akan di tampilkan
     * @return hasil berupa tampilan nilai increment dengan panjang karakter ditentukan dan letak nilainya menyesuaikan posisi karakter
     */
    public String Increment1(int pjg, int mxno) {
        //String[] data = new String[pjg];
        String huruf = "";
        String hasil = "";
        //int a = pjg;
        int i = 1;
        int j = 1;
        while (i <= mxno) {
            j=1; huruf="";
            if (i > 99) {
                while (j < pjg-2) {
                    huruf = huruf + '0';
                    j++;
                }
                hasil += huruf + i + "\n";
            }else if (i > 9) {
                while (j < pjg-1) {
                    huruf = huruf + '0';
                    j++;
                }
                hasil += huruf + i + "\n";
            } else {
                while (j < (pjg)) {
                    huruf = huruf + '0';
                    j++;
                }
                hasil += huruf + i + "\n";
            }
            i++;
        }
        return hasil;
    }

}
