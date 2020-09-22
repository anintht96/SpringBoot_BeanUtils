package spring.boot.beanutils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBeanUtilsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBeanUtilsApplication.class, args);
		
		MainApp mainApp=new MainApp();
		mainApp.save();
	}

}
