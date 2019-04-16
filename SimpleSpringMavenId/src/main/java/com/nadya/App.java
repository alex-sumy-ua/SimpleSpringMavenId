package com.nadya;

import com.nadya.impls.RobotImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        RobotImpl robot = applicationContext.getBean("robot", RobotImpl.class);
//        System.out.println(robot);
        robot.fire();


        RobotImpl robot2 = (RobotImpl) applicationContext.getBean("robotImpl2");
//        System.out.println(robot2);
        robot2.fire();

        ((ClassPathXmlApplicationContext)applicationContext).close(); // destroy
    }

}
