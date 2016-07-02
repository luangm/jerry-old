package io.luan.jerry.user.service.impl;

import io.luan.jerry.user.converter.UserConverter;
import io.luan.jerry.user.dao.UserDAO;
import io.luan.jerry.user.domain.User;
import io.luan.jerry.user.po.UserPO;
import io.luan.jerry.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of UserService
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserConverter userConverter;

    @Override
    public User getUser(Long userId) {
        if (userId == null) {
            return null;
        }

        UserPO userPO = userDAO.getUser(userId);
        if (userPO == null) {
            return null;
        }

        User user = userConverter.convert(userPO);
        return user;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }
}
