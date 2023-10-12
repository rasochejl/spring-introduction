package cz.inventi.kpj.spring.springintroduction.application;

import cz.inventi.kpj.spring.springintroduction.config.GreetingConfigProperties;
import cz.inventi.kpj.spring.springintroduction.service.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "cz.inventi.kpj.spring.springintroduction")
@EnableConfigurationProperties(GreetingConfigProperties.class)
public class SpringIntroductionApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringIntroductionApplication.class, args);
		var bean = context.getBean(GreetingService.class);
		System.out.println("ConstantText: " + bean.getConstantText());
		System.out.println("FileText: " + bean.getFileText());
	}

}
