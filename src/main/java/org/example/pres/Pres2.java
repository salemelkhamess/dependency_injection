package org.example.pres;

import org.example.dao.IDao;
import org.example.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args)   throws  Exception{
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDa= Class.forName(daoClassName);
            IDao d = (IDao) cDa.newInstance();


            String metierClassName = scanner.nextLine();
            Class cMetier= Class.forName(metierClassName);
          //  IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(d);
            IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
            Method setDao= cMetier.getDeclaredMethod("setDao", IDao.class);
            setDao.invoke(metier,d);

            System.out.println("RES =" + metier.calcule());



        }catch (FileNotFoundException | ClassNotFoundException | InstantiationException | IllegalAccessException
                e){
            throw new RuntimeException(e);
        }
    }
}
