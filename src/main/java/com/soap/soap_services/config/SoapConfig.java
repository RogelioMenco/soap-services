package com.soap.soap_services.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.core.io.ClassPathResource;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class SoapConfig {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.soap.soap_services");
        return marshaller;
    }

    @Bean(name = "myService")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema mySchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("MyServicePort");
        definition.setLocationUri("/ws");
        definition.setTargetNamespace("http://example.com/soap");
        definition.setSchema(mySchema);
        return definition;
    }

    @Bean
    public XsdSchema mySchema() {
        return new SimpleXsdSchema(new ClassPathResource("wsdl/my-service.wsdl"));
    }
}
