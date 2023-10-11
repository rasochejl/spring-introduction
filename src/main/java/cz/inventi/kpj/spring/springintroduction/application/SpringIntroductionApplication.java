package cz.inventi.kpj.spring.springintroduction.application;

import cz.inventi.kpj.spring.springintroduction.service.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "cz.inventi.kpj.spring.springintroduction")
public class SpringIntroductionApplication {


	/*

	Spring defaultně skenuje aktuální package třídy oanotované @SpringBootApplication. Po přesunutí do složky
	application Spring tedy přestal vidět zbytek kódu. Anotací @ComponentScan určíme, jakou package v našem případě
	má skenovat.

	 */

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringIntroductionApplication.class, args);
		var bean = context.getBean(GreetingService.class);
		System.out.println("ConstantText: " + bean.getConstantText());
		System.out.println("FileText: " + bean.getFileText());
	}

}
