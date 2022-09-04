package ro.sda.javaRo39.task4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestTask4 implements CommandLineRunner{

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Getting dummyLogger.");
        DummyLogger dummyLogger = (DummyLogger) applicationContext.getBean("dummyLogger");
        dummyLogger.sayHi();

        System.out.println("Getting listUtility");
        ListUtil listUtil = (ListUtil) applicationContext.getBean("listUtil");
        System.out.println(listUtil.sumElements(List.of(1,2,3)));

        System.out.println("Getting stringUtility");
        StringUtil stringUtil = (StringUtil) applicationContext.getBean("stringUtility");
        System.out.println(stringUtil.formSentence(List.of("Ana","are","mere")));


    }
}
