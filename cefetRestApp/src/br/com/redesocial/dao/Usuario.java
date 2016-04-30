package br.com.redesocial.dao;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario {
	
		private String nome, email;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
}
