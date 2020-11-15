package com.lance.mybatissharp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Lance
 */
@Data
@TableName("t_player")
public class PlayerEntity {

    private int    id;
    private String username;
    private String password;
}
