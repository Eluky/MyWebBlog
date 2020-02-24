package com.eluky.blog.controller;

import com.eluky.blog.dao.UserDAO;
import com.eluky.blog.result.Result;
import com.eluky.blog.result.ResultFactory;
import com.eluky.blog.info.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    private UserDAO userDAO;

    @CrossOrigin
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(@Valid @RequestBody UserInfo userInfo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String message = String.format("登陆失败，详细信息[%s]。", bindingResult.getFieldError().getDefaultMessage());
            return ResultFactory.buildFailResult(message);
        }
        UserInfo user = userDAO.getByUsernameAndPassword(userInfo.getUsername(),userInfo.getPassword());
        if (null == user) {
            String message = String.format("登陆失败，详细信息[用户名、密码信息不正确]。");
            return ResultFactory.buildFailResult(message);
        }else{
            return ResultFactory.buildSuccessResult("登陆成功。");
        }

    }
}
