package br.com.kayque.controlador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login implements Acao {

		@Override
		public String executa(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			
			return "redirect:entrada?acao=LoginForm";       		
		}

}


