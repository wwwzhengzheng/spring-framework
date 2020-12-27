import com.zz.config.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * zhengzheng
 */
public class DemoMain {
	public static void main(String[] args) {

		/**
		 *1、方式一：xml配置的加载方式
		 */
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("demo.xml");
//		Person person = classPathXmlApplicationContext.getBean(Person.class);
//
//		System.out.println(person);

		/**
		 * 2、方式二：注解方式
		 */
		//1、注解应用上下文
		//说明：使用AnnotationConfigApplicationContext可以实现基于Java的配置类加载Spring的应用上下文。避免使用application.xml进行配置

		System.out.println("1:在DemoMain测试类中-执行方法-new AnnotationConfigApplicationContext()-测试main函数进行，开始实例化AnnotationConfigApplicationContext 对象ctx。。。。");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();


//		System.out.println("2:在DemoMain测试类中-执行方法ctx.register-实例化对象ctx开始注册配置类...");
		ctx.register(Appconfig.class);

		//设置允许循环依赖为false，即不允许循环依赖，默认为true--允许
//		ctx.setAllowCircularReferences(false);
		System.out.println("3:在DemoMain测试类中-执行方法ctx.refresh-上下文刷新...");
		ctx.refresh();
	}
}
