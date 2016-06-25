package io.luan.jerry.user.dao;

import io.luan.jerry.user.domain.UserDO;

/**
 * Created by Miao on 6/25/2016.
 */
public interface UserDAO {
    UserDO getUser(long userId);

    UserDO getUserByUsername(String username);
}
