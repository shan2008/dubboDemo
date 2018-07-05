package youshan.com.consumer.entity;

import java.io.Serializable;

/**
 * @author syou
 * @date 2018/6/23.
 */
public class UserInfoEntity implements Serializable {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private int id;
    private String userName;
}
