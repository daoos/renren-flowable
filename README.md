# renren-flowable

利用renren-fast作为基础，结合flowable写一些流程引擎的demo。
### renren-fast
> 官网：<https://www.renren.io/guide/>
### flowable
> 官网：<https://www.flowable.org/> 
当前使用版本6.4.2

### flowable用户手册
> [地址](http://www.shareniu.com/flowable6.5_zh_document/bpm/index.html#springintegration)

### flowable数据库初始化
> 使用flowable-6.4.2/database/create/all目录下的建表SQL，进行数据库初始化。 
>本项目使用MySQL的版本是5.7.28，低于5.7的版本，建表不会成功。
其他类型数据库还没有尝试。

### 添加flowable的maven依赖
````$xslt
<flowable.version>6.4.2</flowable.version>

<dependency>
  <groupId>org.flowable</groupId>
  <artifactId>flowable-spring-boot-starter</artifactId>
  <version>${flowable.version}</version>
</dependency>
````
### 配置Flowable
```$xslt
文件路径：io.renren.config.FlowableConfig
PS:如果流程数据库和业务数据库不一样，需要在这里进行指定。
但是没有测试过2个数据库分开的情况，现在使用的是一个数据库。
```

### 一些说明
```$xslt
1、本工程没有集成【流程设计器】，可以使用下载的flowable里面的war包启动单独的设计器。
   流程设计完成后保存为BPMN20文件，拷贝文件到本工程的resource/processes目录下。
   工程启动会自动部署流程。
2、
```
### 相关链接
* [renren-fast](https://www.renren.io/guide/)
* [Spring平台整合activiti工作流引擎实例](https://gitee.com/shenzhanwang/Spring-activiti)
* [采用springboot+flowable快速实现工作流](https://blog.csdn.net/puhaiyang/article/details/79845248)