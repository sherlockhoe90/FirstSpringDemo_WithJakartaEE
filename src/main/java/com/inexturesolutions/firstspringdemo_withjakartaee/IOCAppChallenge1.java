//package com.inexturesolutions.firstspringdemo_withjakartaee;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class IOCAppChallenge1 {
//
//    public static void main(String[] args) {
//
//
//        // create the application context (container)
//        /*the compiler will only be able to read the bean configuration file if it is under the src/main/resources/ folder (the one in META-INF is not considered)*/
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
//
//        // create the bean
//        City city = (City) ctx.getBean("myCity");
//
//        // invoke the city name method
//        city.cityName();
//
//        // close the application context (container)
//        ((ClassPathXmlApplicationContext) ctx).close();
//    }
//}
