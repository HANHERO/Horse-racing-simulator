package com.alevel.java7.finalproject.horseracingsimulator;


import com.alevel.java7.finalproject.horseracingsimulator.data.model.Users;
import com.alevel.java7.finalproject.horseracingsimulator.data.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HorseRacingSimulatorApplication {

    //	private static final Logger log = LoggerFactory.getLogger(HorseRacingSimulatorApplication.class);
//    @Autowired
//    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(HorseRacingSimulatorApplication.class, args);
    }


    //	@Bean
//	public CommandLineRunner demo(UserRepository repository) {
//		return (args) -> {
//			// save a couple of customers
//			repository.save(new Users("Login1", "Password"));
//			repository.save(new Users("Login2", "Password"));
//			repository.save(new Users("Login3", "Password"));
//
//			// fetch all customers
//			log.info("Users found with findAll():");
//			log.info("-------------------------------");
//			for (Users users : repository.findAll()) {
//				log.info(users.toString());
//			}
//			log.info("");
//
//		};
//}

}
