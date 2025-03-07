import java.util.Scanner;
public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatAdapter = new ChatServiceAdapter(legacyChat);
        chatAdapter.sendMessage("Narxoz");
    }
}
