package cn.cai.template.db.dao;

import cn.cai.template.db.entity.BsUser;
import java.util.List;

public interface BsUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(BsUser record);

    BsUser selectByPrimaryKey(String id);

    List<BsUser> selectAll();

    int updateByPrimaryKey(BsUser record);
}