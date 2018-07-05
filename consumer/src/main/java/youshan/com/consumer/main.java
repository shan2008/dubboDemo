package youshan.com.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import youshan.com.consumer.entity.UserInfoEntity;
import youshan.com.consumer.service.UserInfoService;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author syou
 * @date 2018/7/4.
 */
public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");
        context.start();
        UserInfoService userInfoService=(UserInfoService)context.getBean(UserInfoService.class);
        UserInfoEntity entity=userInfoService.getUserInfoById(1);
        System.out.println(Optional.of(entity).map(UserInfoEntity::getUserName).orElse("。。。"));

    }
}
