package tgs.budgeting;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ChatModelController {

    private final ChatClient openAiChatClient;

    public ChatModelController(ChatClient openAiChatClient){
        this.openAiChatClient = openAiChatClient;
    }

    @GetMapping("/chat-model")
    String chat(String prompt){
        return this.openAiChatClient.call(prompt);
    }


}
