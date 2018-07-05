package youshan.com.consumer.respository;

import youshan.com.consumer.entity.UserInfoEntity;

/**
 * @author syou
 * @date 2018/6/23.
 */
public interface UserInfoRespository {

    UserInfoEntity getUserInfoById(int id);

    void deleteUserInfoById(int id);
}
