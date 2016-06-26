package io.luan.jerry.user.service.impl;

import io.luan.jerry.user.assembler.UserAssembler;
import io.luan.jerry.user.dao.UserDAO;
import io.luan.jerry.user.domain.User;
import io.luan.jerry.user.po.UserPO;
import io.luan.jerry.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Implementation of UserService
 */

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserAssembler userAssembler;

    @Override
    public User getUser(long userId) {
        UserPO userPO = userDAO.getUser(userId);
        User user = userAssembler.assemble(userPO);
        return user;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }
}
