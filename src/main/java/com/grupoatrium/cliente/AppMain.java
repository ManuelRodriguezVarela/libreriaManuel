package com.grupoatrium.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("confModelo.xml", "persistenciaConfig.xml, applicationContext.xml");
		
		// Recuperar del contenedor los beans empleado
		System.out.println(context.getBean("autor1"));
		System.out.println(context.getBean("libro2"));
	}

}
