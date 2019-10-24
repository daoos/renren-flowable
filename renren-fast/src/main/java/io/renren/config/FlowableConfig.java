package io.renren.config;

import io.renren.datasource.config.DynamicDataSource;
import io.renren.datasource.properties.DataSourceProperties;
import org.flowable.spring.SpringProcessEngineConfiguration;
import org.flowable.spring.boot.EngineConfigurationConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * 为解决flowable图片中的中文乱码
 *
 * @date 2018/12/19
 */
@Configuration
public class FlowableConfig implements EngineConfigurationConfigurer<SpringProcessEngineConfiguration> {

    @Autowired
    DataSourceProperties dataSourceProperties;
    @Override
    public void configure(SpringProcessEngineConfiguration engineConfiguration) {
        engineConfiguration.setActivityFontName("宋体");
        engineConfiguration.setLabelFontName("宋体");
        engineConfiguration.setAnnotationFontName("宋体");
        //设置数据源
//      engineConfiguration.setJdbcUrl(dataSourceProperties.getUrl());
//      engineConfiguration.setJdbcDriver(dataSourceProperties.getDriverClassName());
//      engineConfiguration.setJdbcUsername(dataSourceProperties.getUsername());
//      engineConfiguration.setJdbcPassword(dataSourceProperties.getPassword());
    }
}
