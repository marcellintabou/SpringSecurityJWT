package com.marco.opendevup;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.marco.opendevup.dao.SpecialisteRepository;
import com.marco.opendevup.entities.AppRole;
import com.marco.opendevup.entities.AppUser;
import com.marco.opendevup.entities.Specialiste;
import com.marco.opendevup.service.AccountService;

@SpringBootApplication
public class UrgencesanteApplication implements CommandLineRunner{
	
	@Autowired
	private SpecialisteRepository specialisteRepository;
	
	@Autowired
	private AccountService accountService;
	
	public static void main(String[] args) {
		SpringApplication.run(UrgencesanteApplication.class, args);
	}
	@Bean  //Au demarrage de l'applicatyion, toutes les methodes qui sont précedée par l'annotation Bean sont exécutées, deviennent un bean et on peut l'injecter partout
	public BCryptPasswordEncoder getBcrypt() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void run(String... args) throws Exception {
		/*accountService.saveUser(new AppUser(null, "admin", "1234", null));
		accountService.saveUser(new AppUser(null, "user", "1234", null));
		accountService.saveRole(new AppRole(null, "ADMIN"));
		accountService.saveRole(new AppRole(null, "USER"));
		accountService.addRoleToUser("admin", "ADMIN");
		accountService.addRoleToUser("admin", "USER");
		accountService.addRoleToUser("user", "USER");
		Stream.of("S1", "S2", "S3").forEach(t->{
			specialisteRepository.save(new Specialiste(null, t));
		}); 
		specialisteRepository.findAll().forEach(s->{
			System.out.println(s.getNom());
		});*/
	}
}
