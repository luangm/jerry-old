package io.luan.jerry.user.service.impl;

import io.luan.jerry.user.assembler.UserAssembler;
import io.luan.jerry.user.dao.UserDAO;
import io.luan.jerry.user.domain.UserDO;
import io.luan.jerry.user.sdo.User;
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
        UserDO userDO = userDAO.getUser(userId);
        User sdo = userAssembler.assemble(userDO);
        return sdo;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }
}
