package kz.iitu.projects.zoomedcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ZooMedcenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZooMedcenterApplication.class, args);
	}
}
