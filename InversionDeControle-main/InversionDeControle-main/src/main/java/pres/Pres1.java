package pres;

import dao.DaoImpl;
import dao.DaoImplV2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 dao = new DaoImplV2(); //Instanciation statique
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Res :"+metier.calcul());
    }
}


