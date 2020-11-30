package com.maskan.csv;

import java.net.MalformedURLException;
import java.net.URL;

import com.maskan.csv.ws.MessageRelay;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;


//JAX-WS Client context configuration class
@Configuration
@ComponentScan("com.maskan.csv.*")
public class SpringContextConfig {

    @Bean
    public JaxWsPortProxyFactoryBean myWebService() {

        JaxWsPortProxyFactoryBean proxyFactory =
                new JaxWsPortProxyFactoryBean();

        try {
            proxyFactory.setWsdlDocumentUrl(new URL("http://192.168.111.52:8080/core/MessageRelayService?wsdl"));
            proxyFactory.setServiceInterface(MessageRelay.class);
            //from WSDL file:
            proxyFactory.setServiceName("MessageRelayService");
            proxyFactory.setPortName("MessageRelayPort");
            proxyFactory.setNamespaceUri("http://webservice.smsrelay.armaghan.net/");

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return proxyFactory;

    }

}
