package youshan.com.consumer.service;

import youshan.com.consumer.entity.UserInfoEntity;

/**
 * @author syou
 * @date 2018/6/23.
 */
public interface UserInfoService {
    UserInfoEntity getUserInfoById(int id);

    void deleteUserInfo(int id);
}
