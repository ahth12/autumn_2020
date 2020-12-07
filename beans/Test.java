import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("TestConfig.xml");
        Radio a = context.getBean("RD", Radio.class);
        a.playSong();
        a.switchStation();
        a.playSong();
        a.switchStation();
        a.playSong();


    }
}
