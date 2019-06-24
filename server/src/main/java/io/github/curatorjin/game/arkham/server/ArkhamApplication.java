/*
 *
 * 文件名: ArkhamApplication.java
 * 描述: 一句话描述
 * 创建人: curatorjin
 * 时间: 2019/6/25  0:35
 *
 */
package io.github.curatorjin.game.arkham.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 入口类
 *
 * @author : curatorjin
 * @version : ${VERSION}
 */
@SpringBootApplication
public class ArkhamApplication
{
    /**
     * Springboot启动函数
     *
     * @param args 启动参数
     */
    public static void main(String[] args)
    {
        SpringApplication.run(ArkhamApplication.class, args);
    }
}
