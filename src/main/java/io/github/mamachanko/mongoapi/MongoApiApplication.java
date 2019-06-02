package io.github.mamachanko.mongoapi;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SpringBootApplication
public class MongoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoApiApplication.class, args);
	}

}

@Document
@Data
class Meal {
 
    @Id
    private String id;
 
    private String name;
}

@RepositoryRestResource
interface ThingRepository extends PagingAndSortingRepository<Meal, Long> { }
