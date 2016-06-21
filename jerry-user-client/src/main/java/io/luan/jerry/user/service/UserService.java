package io.luan.jerry.user.service;

import io.luan.jerry.user.sdo.UserSDO;

/**
 * User Service interface
 */
public interface UserService {

    UserSDO getUser(long userId);

    UserSDO getUserByUsername(String username);
}
