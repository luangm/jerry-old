package io.luan.jerry.user.converter;

import io.luan.jerry.user.domain.User;
import io.luan.jerry.user.po.UserPO;
import org.springframework.stereotype.Component;

/**
 * Transform CategoryDO to/from CategorySDO
 */
@Component
public class UserConverter {

    public User convert(UserPO po) {
        User user = new User();
        user.setId(po.getId());
        user.setNick(po.getNick());
        user.setName(po.getName());
        user.setPhone(po.getPhone());
        user.setCreateTime(po.getCreateTime());
        user.setUpdateTime(po.getUpdateTime());

        return user;
    }
}
