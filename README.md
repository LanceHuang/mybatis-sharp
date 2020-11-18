# mybatis-sharp
在mybatis、mybatis-plus的基础上，进行一定的增强

### 设计原则
* 约定大于配置
* 可拓展

### 多租户

### 自动建表
在actable项目的基础上，进行一定的修改。项目中只需要调用MyBatisSchemaUpdate，即可进行自动建表。受水平限制，目前只支持MySQL  

* 若只使用mybatis，则按默认配置；
* 若使用了mybatis-plus，则读取mybatis-plus的注解；
* 若希望自定义类型，则添加mybatis-sharp提供的注解？

### 后续开发计划
* 随着开发的内容越来越多，将不同的功能，弄成不同的maven子工程