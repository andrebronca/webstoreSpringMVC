package com.packt.webstore.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/*
	 * Isso especifica a configuração de classes para
	 * o contexto raiz da aplicação.
	 * pertence a todo o aplicativo.
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	/*
	 * Isso especifica a configuração da classe para o 
	 * contexto da aplicação do servlet dispatcher
	 * específico para o servlet dispatcher.
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {
				WebApplicationContextConfig.class
		};
	}

	/*
	 * Isso especifica o mapeamento do servlet para o
	 * DispatcherServlet
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
