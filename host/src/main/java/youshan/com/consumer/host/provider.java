package youshan.com.consumer.host;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author syou
 * @date 2018/7/3.
 */
public class provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
        context.start();
        System.in.read();
    }
}
