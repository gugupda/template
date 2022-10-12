package cn.cai.template.controller;

import cn.cai.template.common.R;
import cn.cai.template.db.pojo.BsUser;
import cn.cai.template.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public R getUserList(){

        List<BsUser> list = userService.selectAll();
        return R.ok().put("list",list);
    }

}
