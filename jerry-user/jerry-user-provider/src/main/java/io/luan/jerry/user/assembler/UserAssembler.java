package io.luan.jerry.user.assembler;

import io.luan.jerry.user.domain.UserDO;
import io.luan.jerry.user.sdo.User;
import org.springframework.stereotype.Component;

/**
 * Transform CategoryDO to/from CategorySDO
 */
@Component
public class UserAssembler {

    public User assemble(UserDO userDO) {
        User sdo = new User();
        sdo.setId(userDO.getId());
        sdo.setUsername(userDO.getUsername());
        sdo.setName(userDO.getName());
        sdo.setPhone(userDO.getPhone());
        sdo.setCreateTime(userDO.getCreateTime());
        sdo.setUpdateTime(userDO.getUpdateTime());

        return sdo;
    }
}
