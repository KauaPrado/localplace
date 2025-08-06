package endereco.busca.localplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LocalplaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalplaceApplication.class, args);
	}

}
