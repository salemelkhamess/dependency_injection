package org.example.pres;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.example.ext" , "org.example.metier" );
        IMetier metier =  applicationContext.getBean(IMetier.class);
        System.out.println("RES =" +metier.calcule());

    }
}
