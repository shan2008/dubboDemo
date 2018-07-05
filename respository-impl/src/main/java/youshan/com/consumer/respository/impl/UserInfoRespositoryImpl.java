package youshan.com.consumer.respository.impl;

import org.springframework.stereotype.Component;
import youshan.com.consumer.respository.UserInfoRespository;
import youshan.com.consumer.entity.UserInfoEntity;

/**
 * @author syou
 * @date 2018/6/23.
 */
@Component
public class UserInfoRespositoryImpl implements UserInfoRespository {

    @Override
    public UserInfoEntity getUserInfoById(int id) {
        UserInfoEntity userInfo = new UserInfoEntity();
        userInfo.setId(1);
        userInfo.setUserName("shan");
        return userInfo;
    }

    @Override
    public void deleteUserInfoById(int id) {
        System.out.println("删除用户成功");
    }
}
