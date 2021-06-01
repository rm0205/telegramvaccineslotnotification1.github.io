package com.sample.cowin.app.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
//import org.telegram.telegrambots.bots.TelegramLongPollingBot;
//import org.telegram.telegrambots.meta.TelegramBotsApi;
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
//import org.telegram.telegrambots.meta.api.objects.Update;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//import org.telegram.telegrambots.meta.generics.BotSession;
//import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

//import org.telegram.telegrambots.ApiContextInitializer;


@SpringBootApplication
@Component
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		
		
//		try {
//           
//			TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
//            telegramBotsApi.registerBot(new AppApplication());
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
// 
//	        
//		 
//	}


//	@Override
//	public void onUpdateReceived(Update update) {
//		 
//		 ;


	}
}