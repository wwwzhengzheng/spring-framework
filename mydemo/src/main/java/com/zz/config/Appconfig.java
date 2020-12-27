package com.zz.config;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author zhengzheng
 *
 *
 *
 * @Configuration
 * 该注解是可以用来替代XML文件。
 * 以前我们配置bean时，都是写在applicationContext.xml文件中的。
 * 有了这个注解后，我们就可以编写一个类在其上面加上该注解。即配置类。
 * 在配置类中可以在方法上加@Bean注解定义其中的Bean
 *
 * @Configurable
 * 现在假设，我们想在非Spring管理的类中使用依赖注入；
 * 比如：手动new出来的对象，正常情况下，Spring是无法依赖注入的，这个时候可以使用@Configurable注解；
 *
 */

@Configurable
@ComponentScan("com.zz")
public class Appconfig {
}
