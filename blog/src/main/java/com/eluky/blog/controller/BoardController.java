package com.eluky.blog.controller;

import com.eluky.blog.info.BoardInfo;
import com.eluky.blog.dao.BoardDAO;
import com.eluky.blog.result.Result;
import com.eluky.blog.result.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardDAO boardDAO;

    @CrossOrigin
    @RequestMapping(value = "/message/addMessage", method = RequestMethod.POST)
    @ResponseBody
    public Result addMessage(@RequestBody BoardInfo boardInfo, BindingResult bindingResult){
        boardDAO.save(boardInfo);
        return ResultFactory.buildSuccessResult("留言成功");
    }
}
