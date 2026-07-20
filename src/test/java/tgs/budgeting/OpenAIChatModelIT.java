package tgs.budgeting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@EnabledIfEnvironmentVariable(
        named = "OPENAI_API_KEY",
        matches = ".+")
public class OpenAIChatModelIT {

    @Autowired
    ChatClient chatClient;

    @Test
    void should_receiveResponse_when_chatModelIsCalled() {


        var response = chatClient.call(
                "Gere um registro de budgeting, com descrição de gasto, valor em reais e local."
        );

        assertThat(response).isNotNull();
        System.out.println(response);
    }
}
