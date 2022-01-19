package com.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Por defecto el id autogenerado del bean es el nombre de la clase con la primera letra en minuscula
        UserService user = (UserService) context.getBean("userService");
        user.notificacion.imprimirSaludo();

    }
}