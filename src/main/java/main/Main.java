package main;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class Main extends TelegramLongPollingBot{

    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

        TelegramLongPollingBot bot = new Main();





        try {
            telegramBotsApi.registerBot(bot);
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }
    public void onUpdateReceived(Update update) {
        String message=update.getMessage().getText();
        System.out.println("hello");
        SendMessage sendMessage=new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(update.getMessage().getChatId());
        sendMessage.setText("hello");
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            System.out.println("Exception");
        }
    }

    public String getBotUsername() {
        return "Speeker";
    }

    public String getBotToken() {
        return "1039759549:AAGB3VHb-uPXR4Tc2SDamisyyU8-dg6LW5s";
    }
}

//class Bot extends TelegramLongPollingBot{
//
//}
