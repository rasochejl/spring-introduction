package cz.inventi.kpj.spring.springintroduction.main;

import cz.inventi.kpj.spring.springintroduction.service.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cz.inventi.kpj.spring.springintroduction")


public class SpringIntroductionApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringIntroductionApplication.class, args);
		var bean = context.getBean(GreetingService.class);
		System.out.println("ConstantText: " + bean.getConstantText());
		System.out.println("FileText: " + bean.getFileText());
	}

}
