package org.example.ext;

import org.example.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2  implements IDao {
    @Override
    public double getData() {
        System.out.println("Version captures ...");
        double t = 12;

        return t;
    }
}
