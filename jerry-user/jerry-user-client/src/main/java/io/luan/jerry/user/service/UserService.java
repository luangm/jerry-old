package io.luan.jerry.user.service;

import io.luan.jerry.user.domain.User;

/**
 * User Service interface
 */
public interface UserService {

    User getUser(long userId);

    User getUserByUsername(String username);
}
