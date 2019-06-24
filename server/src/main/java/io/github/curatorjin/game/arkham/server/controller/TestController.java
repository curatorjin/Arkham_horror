/*
 *
 * 文件名: TestController.java
 * 描述: 一句话描述
 * 创建人: curatorjin
 * 时间: 2019/6/25  0:37
 *
 */
package io.github.curatorjin.game.arkham.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Class/Interface/Enum description
 *
 * @author : curatorjin
 * @version : ${VERSION}
 */
@RestController
@RequestMapping("/test")
public class TestController
{
    /**
     * 测试
     *
     * @return 测试字符串
     */
    @RequestMapping(value = "/getStr", produces = "text/html;charset=UTF-8")
    public String test()
    {
        return "hello world";
    }
}
