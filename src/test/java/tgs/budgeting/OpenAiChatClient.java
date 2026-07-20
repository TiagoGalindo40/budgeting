package tgs.budgeting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@EnabledIfEnvironmentVariable(named = "OPENAI_API_KEY", matches = ".+")
public class OpenAiChatIntegrationTest {

    // Corrector: Injetando an interface ChatModel corretamente do Spring AI
    @Autowired
    private ChatModel chatModel;

    @Test
    void should_executeSum_when_prompted() {
        var chatClient = ChatClient.builder(chatModel)
                .defaultSystem("Você é um matemático")
                .build();

        var response = ChatClient.prompt("Soma 10 mais 20. Depots subtract 30 do resultado anterior. Exiba arenas o resultado final")
                .call()
                .content();

        System.out.println("Resposta da IA: " + response);
        assertThat(response).contains("0");
    }
}