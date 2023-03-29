package com.yupi.autoreply.controller;

import com.yupi.autoreply.service.AiAnswerService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 开放接口
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@RestController
@RequestMapping("/openAi")
@Slf4j
public class MainController {

    @Autowired
    private AiAnswerService aiAnswerService;

    @RequestMapping("/ChatGPT")
    public String ChatGPT(String prompt,String passwd){
        if ("xu1299947221".equals(passwd)){
            return aiAnswerService.doAnswer(prompt);
        }else{
            return "抱歉,我还不够回答您的问题!";
        }
    }

}
