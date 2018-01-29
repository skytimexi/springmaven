package com.xi.test;

import com.xi.myspring.service.UserTestService;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by admin on 2018/1/26.
 */
public class SpringTest {

    public static void main(String[] args) throws InterruptedException {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.setValidating(false);
        context.load("classpath*:spring/spring-*.xml");
        context.refresh();
        UserTestService userService = context.getBean(UserTestService.class);
        while (true) {
            System.out.println(userService.findUser());
            Thread.sleep(10000);
        }
    }
}
