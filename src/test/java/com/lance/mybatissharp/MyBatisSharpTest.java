package com.lance.mybatissharp;

import com.lance.mybatissharp.config.Config;
import com.lance.mybatissharp.entity.PlayerEntity;
import com.lance.mybatissharp.mapper.PlayerMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

/**
 * @author Lance
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Config.class)
class MyBatisSharpTest {

    @Resource
    private PlayerMapper playerMapper;

    @Test
    void test() {
        PlayerEntity playerEntity = playerMapper.selectById(1);
        System.out.println(playerEntity);
    }
}