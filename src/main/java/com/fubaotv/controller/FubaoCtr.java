package com.fubaotv.controller;
import com.fubaotv.dao.FubaoUserDao;
import com.fubaotv.dao.StreamingDao;
import com.fubaotv.vo.FubaoUserVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/user")
public class FubaoCtr {
    @GetMapping("/select")
    public String UserSelect() { // View로 모델을 넘겨주는 객체
        System.out.println("ㅂㅂㅂㅂㅂㅂㅂㅂㅂㅂㅂㅂㅂㅂㅂㅂ");
        return "thymeleafEx/test";
    }
}
