package com.zhanglin.networkSlicingBackend.ms.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration  
public class RestTemplateConfig{  
    @Bean  
    public RestTemplate restTemplate(ClientHttpRequestFactory factory){
        return new RestTemplate(factory);
//        RestTemplate restTemplate = new RestTemplate(factory);
//        //Response status code 4XX or 5XX to the client.
//        restTemplate.setErrorHandler(new ThrowErrorHandler());
//        return restTemplate;
    }  
      
    @Bean  
    public ClientHttpRequestFactory simpleClientHttpRequestFactory(){  
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();  
        factory.setReadTimeout(10000);//ms
        factory.setConnectTimeout(15000);//ms
        return factory;  
    }  
}  
