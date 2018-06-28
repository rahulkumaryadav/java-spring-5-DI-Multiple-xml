package rk.com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rk.com.beans.Organisation;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");

        Organisation organisation=applicationContext.getBean(Organisation.class);
        System.out.println(organisation);
    }
}
