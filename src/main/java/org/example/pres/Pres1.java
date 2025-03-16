package org.example.pres;

import org.example.dao.DaoImpl;
import org.example.ext.DaoImplV2;
import org.example.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        DaoImplV2 d2 = new DaoImplV2();



        MetierImpl metier = new MetierImpl(d);
        metier.setDao(d2); // injecrion des dependence
        System.out.println("RES+" +metier.calcule());
    }
}
