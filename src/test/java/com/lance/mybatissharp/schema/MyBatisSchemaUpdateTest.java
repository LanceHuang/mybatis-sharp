package com.lance.mybatissharp.schema;

import org.junit.jupiter.api.Test;

/**
 * @author Lance
 */
class MyBatisSchemaUpdateTest {

    @Test
    public void test() {
        MyBatisSchemaSettings schemaSettings = new MyBatisSchemaSettings();
        // todo 添加配置
        MyBatisSchemaUpdate schemaUpdate = new MyBatisSchemaUpdate(schemaSettings);
        schemaUpdate.execute();
    }
}