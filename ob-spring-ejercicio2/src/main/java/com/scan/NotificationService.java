package com.scan;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public NotificationService(){}

    public void imprimirSaludo(){
        System.out.println("Hola desde NotificationService");
    }
}
