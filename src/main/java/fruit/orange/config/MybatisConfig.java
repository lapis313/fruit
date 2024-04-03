//참고 -> https://nazzang19.tistory.com/m/131
//MyBatisConfig.java
//TestController.java
//TestMapper.java
//TestService.java
//TestVO.java
//testmapper.xml
//mybatis-config.xml
//application.properties
//build.gradle
package fruit.orange.config;

import javax.sql.DataSource;

//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
//@MapperScan(basePackages = "fruit.orange.mapper")
public class MybatisConfig {
	/*
	@Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
      */  
        //PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //sessionFactory.setMapperLocations(resolver.getResources("classpath:mapper/**/*.xml"));
        /*
        Resource myBatisConfig = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/mybatis-config.xml");
        sessionFactory.setConfigLocation(myBatisConfig);
        
        sessionFactory.setTypeAliasesPackage("fruit.orange.vo");
        
        return sessionFactory.getObject();
        
    }
         */
}
