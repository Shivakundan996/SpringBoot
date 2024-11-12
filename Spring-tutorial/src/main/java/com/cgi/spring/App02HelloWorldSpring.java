package com.cgi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * this is annottaion based configuration
 */
public class App02HelloWorldSpring {

    /**
     * Spring container/Spring IoC conatiner/Spring Context - It's a container tht
     * handles the object creation , managing throughout the application and
     * maintaining(totally managing the lifecycle of bean)
     */

    public static void main(String[] args) {
        // 1.launch a SpringContext
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Configure the things that we want Spring to manage -@Configuration
        // HelloWorldConfiguration - @Configuration

        // name - @Bean
        // 3: Retreiving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class)); // we can call it like this also ,as it is identified by Bean
                                                            
    }

}
