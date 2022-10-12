package cn.cai.template.service.impl;

import cn.cai.template.db.dao.BsUserMapper;
import cn.cai.template.db.pojo.BsUser;
import cn.cai.template.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BsUserMapper bsUserMapper;

    @Override
    public List<BsUser> selectAll() {
        return bsUserMapper.selectAll();
    }
}
