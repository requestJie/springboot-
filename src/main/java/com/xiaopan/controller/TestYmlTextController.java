package com.xiaopan.controller;

import com.xiaopan.vo.YmlTestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestYmlTextController {
    @Value("${test}")
    private String ymlText;
    @Autowired
    private YmlTestVO ymlTestVO;

    @RequestMapping("/ymlText")
    public String queryYmlText(){


        return "YML取数据text:"+ymlText+"@ConfigurationProperties:"+ymlTestVO.toString();
    }
}
