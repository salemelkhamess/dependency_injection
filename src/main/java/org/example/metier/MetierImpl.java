package org.example.metier;

import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements  IMetier{

    @Autowired
    private IDao dao; // couplage faile
    public  MetierImpl(){}
    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcule() {
        double t = dao.getData();
        double res = t *12 * Math.PI/2 * Math.cos(t);
        return res;
    }
    public IDao getDao() {
        return dao;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
