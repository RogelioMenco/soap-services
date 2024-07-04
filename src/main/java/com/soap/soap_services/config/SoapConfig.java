package com.soap.soap_services.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableWs
public class SoapConfig {

	@Bean
	@SuppressWarnings("unused")
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/ws/*");
	}

	@Bean
	@SuppressWarnings("unused")
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.soap.soap_services");
		return marshaller;
	}

	@Bean
	@SuppressWarnings("unused")
	public DefaultWsdl11Definition defaultWsdl11Definition(Jaxb2Marshaller marshaller) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("MyPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://example.com/soap");
		wsdl11Definition.setSchema(mySchema());
		return wsdl11Definition;
	}

	@Bean
	@SuppressWarnings("unused")
	public XsdSchema mySchema() {
		return new SimpleXsdSchema(new ClassPathResource("wsdl/my-service.xsd"));
	}
}
