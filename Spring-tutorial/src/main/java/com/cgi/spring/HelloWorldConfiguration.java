package com.cgi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//eliminate verbosity in creating Java beans
//Public accessor methods , constructors ,
// equals ,hashcode and toString are automatically created
//a feature in jdk16 (record)
record Person(String name, int age){}

record Address(String Area, String city){}

@Configuration    // @Component also can used in place of @configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ravana";
    }

    @Bean
    public int age(){
        return 20;
    }

    @Bean
    public Person person(){
        return new Person("Ravi",20);
    }

    @Bean(name = "address2")  // customizing beans , so context.getBean("address2")
    public Address address(){
        return new Address("c/o Lanka","jaywardene city");
    }
}
