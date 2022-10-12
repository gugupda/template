package cn.cai.template.db.dao;

import cn.cai.template.db.pojo.BsUser;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface BsUserMapper {

    List<BsUser> selectAll();

}