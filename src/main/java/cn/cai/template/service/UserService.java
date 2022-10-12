package cn.cai.template.service;

import cn.cai.template.db.pojo.BsUser;

import java.util.List;

public interface UserService {
    public List<BsUser> selectAll();
}
