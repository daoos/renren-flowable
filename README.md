# renren-flowable

利用renren-fast作为基础，写一些flowable流程引擎的demo
###下载 flowable
````$xslt
官网：https://www.flowable.org/ 目前版本6.4.2
````
###flowable用户手册
````$xslt
http://www.shareniu.com/flowable6.5_zh_document/bpm/index.html#springintegration

````
###数据库初始化
````$xslt
使用建表SQL，进行初始化
MySQL版本5.7.28，低于5.7的版本，建表不会成功
其他类型数据没有尝试
````
###添加maven依赖
````$xslt
<flowable.version>6.4.2</flowable.version>

<dependency>
  <groupId>org.flowable</groupId>
  <artifactId>flowable-spring-boot-starter</artifactId>
  <version>${flowable.version}</version>
</dependency>
````
###配置文件 FlowableConfig
```$xslt
为解决flowable图片中的中文乱码
io.renren.config.FlowableConfig
PS:如果流程数据库和业务数据库不一样，需要在这里进行指定。
但是没有测试过2个数据库分开的情况，现在使用的是一个数据库。
```

###一些说明
```$xslt
1、本工程没有集成【流程设计器】，可以使用下载的flowable里面的war包启动单独的设计器。
   流程设计完成后保存为BPMN20文件，拷贝文件到本工程的resource/processes目录下。
   工程启动会自动部署流程。
```