package br.com.redesocial.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@ComponentScan({ "br.com.redesocial.util", "br.com.redesocial.dao"})
@EnableMongoRepositories("br.com.redesocial.dao")
@Import({ MongoConfig.class })
public class AppConfig {

}
