package youshan.com.consumer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import youshan.com.consumer.entity.UserInfoEntity;
import youshan.com.consumer.service.UserInfoService;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author syou
 * @date 2018/7/4.
 */
@Controller
@RequestMapping("/dubbo")
public class Consumer {
    private final UserInfoService userInfoService;
    @Inject
    public Consumer(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @RequestMapping("/consumer")
    public void test(HttpServletResponse response)  throws Exception{
        UserInfoEntity entity= userInfoService.getUserInfoById(1);
        PrintWriter writer=response.getWriter();
        writer.write("Id="+entity.getId()+";name="+entity.getUserName());
    }
}
