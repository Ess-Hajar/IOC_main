package pres;
import dao.IDao;
import metier.IMetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        //DaoImpl dao = new DaoImpl();
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao =(IDao) cDao.getConstructor().newInstance();
        //MetierImpl metier = new MetierImpl();
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        //metier.setDao(dao);
        Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier, dao); //injection des dépendances

        System.out.println("Res" +metier.calcul());
    }
}

