package youshan.com.consumer.service.impl;

import org.springframework.stereotype.Service;
import youshan.com.consumer.service.UserInfoService;
import youshan.com.consumer.respository.UserInfoRespository;
import youshan.com.consumer.entity.UserInfoEntity;

import javax.inject.Inject;

/**
 * @author syou
 * @date 2018/6/23.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    private final   UserInfoRespository userInfoRespository;


    @Inject
    public UserInfoServiceImpl(UserInfoRespository userInfoRespository){
        this.userInfoRespository=userInfoRespository;
    }


    @Override
    public UserInfoEntity getUserInfoById(int id) {
        return userInfoRespository.getUserInfoById(id);
    }

    @Override
    public void deleteUserInfo(int id) {
        userInfoRespository.deleteUserInfoById(id);
    }


}
