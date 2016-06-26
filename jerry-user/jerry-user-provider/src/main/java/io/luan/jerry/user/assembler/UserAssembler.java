package io.luan.jerry.user.assembler;

import io.luan.jerry.user.domain.User;
import io.luan.jerry.user.po.UserPO;
import org.springframework.stereotype.Component;

/**
 * Transform CategoryDO to/from CategorySDO
 */
@Component
public class UserAssembler {

    public User assemble(UserPO po) {
        User sdo = new User();
        sdo.setId(po.getId());
        sdo.setUsername(po.getUsername());
        sdo.setName(po.getName());
        sdo.setPhone(po.getPhone());
        sdo.setCreateTime(po.getCreateTime());
        sdo.setUpdateTime(po.getUpdateTime());

        return sdo;
    }
}
