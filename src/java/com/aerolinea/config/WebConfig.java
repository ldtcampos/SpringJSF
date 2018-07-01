package com.aerolinea.config;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
@EnableWebMvc
@ComponentScan("com.aerolinea")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver
                = new InternalResourceViewResolver();
        resolver.setPrefix("/faces/");
        resolver.setSuffix(".xhtml");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }
    // SE comenta por no usar hibernate
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
//        sfb.setDataSource(restDataSource());
//        sfb.setPackagesToScan(new String[] { "com.aerolinea.entidad" });
//        Properties props = new Properties();
//        props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
////        props.setProperty("driver_class", "");
////        props.setProperty("url", "");
////        props.setProperty("username", "root");
////        props.setProperty("password", "admin");
//        sfb.setHibernateProperties(props);
//        return sfb;
//    }
//    @Bean
//    public DriverManagerDataSource restDataSource() {
//      DriverManagerDataSource dataSource = new DriverManagerDataSource();
//      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//      dataSource.setUrl("jdbc:mysql://localhost:3306/aerolinea?zeroDateTimeBehavior=convertToNull");
//      dataSource.setUsername("root");
//      dataSource.setPassword("admin");
// 
//      return dataSource;
//   }

    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    // Para definir pàgina inicio al correr proyecto
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

}
