import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("TestConfig.xml");
        context.getBean(Quoter.class).sayQuote();
        Radio a = context.getBean(Radio.class);
        a.playSong();
        a.switchStation();
        a.playSong();


    }
}

@Component
class B{
    @Autowired
    Integer integer;

    public B(){
        System.out.println("B constructed");
    }

    @PostConstruct
    public void init(){
        System.out.println(integer);

    }

    @Override
    public String toString() {
        return "B{" +
                "integer=" + integer +
                '}';
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Integer getInteger() {
        return integer;
    }
}
