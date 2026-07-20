package tgs.budgeting;


import com.github.victools.jsonschema.generator.SchemaGeneratorConfigBuilder;
import com.google.protobuf.TextFormat;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
@SpringBootApplication
public class BudgetingApplication {

    private ChatClient builder;

    // Define o Bean do ChatClient global da aplicação usando o Builder auto-configurado pelo Spring AI
	@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Bean
	public ChatClient chatClient(Builder builder) {

        return (ChatClient) builder
				.defaultSystem("Você é um assistente financeiro especializado em orçamentos.")
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(BudgetingApplication.class, args);
	}

	private class Builder {
        public TextFormat.Parser.Builder defaultSystem(String s) {
			return null;
        }
	}
}