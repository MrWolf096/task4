package ro.sda.javaRo39.task4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {

    @Bean
    public DummyLogger dummyLogger(){
        return new DummyLogger();
    }

    @Bean
    public ListUtil listUtil(){
        return new ListUtil();
    }

    @Bean("stringUtility")
    public StringUtil stringUtil(){
        return new StringUtil();
    }
}
