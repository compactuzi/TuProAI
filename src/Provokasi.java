/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author banyu
 */
public class Provokasi {
    public static double provokasi;
    public static double rendah(){
        if (provokasi <= 43 ) return 1;
        else if (provokasi >43 && provokasi < 65) return (65-provokasi)/22;
        else return 0;
    }
    public static double sedang(){
        if (provokasi < 60 && provokasi > 43) return (provokasi-43)/17;
        else if (provokasi == 60 ) return 1;
        else if (provokasi > 60 && provokasi < 65 )return (65-provokasi)/5;
        else return 0;
    }
    public static double tinggi(){
        if (provokasi >60 && provokasi < 65) return (provokasi-60)/5;
        else if (provokasi >= 65 && provokasi <= 75) return 1;
        else if (provokasi>75 && provokasi < 80) return (80-provokasi)/5;
        else return 0;
    }
    public static double sangatTinggi(){
        if (provokasi >= 80) return 1;
        else if (provokasi>75 && provokasi < 80) return (provokasi-75)/5;
        else return 0;
    }
}
