package com.algaworks.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;

@Configuration
public class NotificadorConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtpmail.com");
		notificador.setCaixaAlta(true);
		return notificador;
	}
}
