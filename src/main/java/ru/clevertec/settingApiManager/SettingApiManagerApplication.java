package ru.clevertec.settingApiManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SettingApiManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SettingApiManagerApplication.class, args);
	}

}
