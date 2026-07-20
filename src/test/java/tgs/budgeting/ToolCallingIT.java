package tgs.budgeting;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.MathContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.ai.chat.client.ChatClient.builder;


@SpringBootTest
@EnabledIfEnvironmentVariable(
        named = "OPENAI_API_KEY",
        matches = ".+")
public class ToolCallingIT{

    @Autowired
    OpenAiChatModel openAiChatModel;

    static class MathTools{
        @Tool(description = "soma dois números inteiros, a e b")
        public int sum(int a, int b){
            return a + b;
        }

        @Tool(description = "subtrai dois números inteiros, a e b")
        public int diff(int a, int b){
            return a + b;
        }
    }

    @Test
    void should_executeSum_when_prompted(){
        var chatClient = builder(openAiChatModel)
                .defaultSystem("Você é um matemático").build()
                .equals(new MathContext())
                .build();


        var response = builder(openAiChatModel).defaultSystem("Some 10 mais 20. Depois subtraia 30 dp resultado anterior. Exiba apenas o resultado.")
                .call().text();


        assertThat(response).texts("0");
        System.out.println(response);
    }




}
