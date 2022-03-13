package com.silence.purview.controller;

import com.silence.purview.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class TokenTestController {

    @Autowired
    TokenUtil tokenUtil;
    /**
     * 使用 /login 请求获得 token, /login 不经过拦截器
     */
    @RequestMapping("/login")
    public String login(){
        return tokenUtil.getToken("靓仔","admin");
    }
    /**
     * 使用 /test-token 测试 token，进过拦截器
     */
    @RequestMapping("/test-token")
    public Map testToken(HttpServletRequest request){
        String token = request.getHeader("token");
        return tokenUtil.parseToken(token);
    }

}
