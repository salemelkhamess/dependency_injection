package org.example.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class  DaoImpl implements IDao {
    public double getData() {

        System.out.println("Version base de données");
        double t = 34;
        return t;
    }
}