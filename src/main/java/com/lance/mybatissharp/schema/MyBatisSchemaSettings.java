package com.lance.mybatissharp.schema;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Collection;

/**
 * MyBatis schema配置
 *
 * @author Lance
 */
@Getter
@Setter
@Accessors(chain = true)
public class MyBatisSchemaSettings {

    private String driverClassName;
    private String jdbcUrl;
    private String username;
    private String password;

    /** 数据库表引擎 */
    private String engine;
    /** 数据库表字符集 */
    private String charset;

    /** 实体类集合 */
    private Collection<Class<?>> entityClasses;

    /** 使用模式 */
    private String tableAuto;
}
