package io.luan.jerry.user.dao;

import io.luan.jerry.user.po.UserPO;

/**
 * Created by Miao on 6/25/2016.
 */
public interface UserDAO {

    UserPO getUser(Long userId);
    UserPO getUserByUsername(String username);
}
