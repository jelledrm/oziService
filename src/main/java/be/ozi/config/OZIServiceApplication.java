package be.ozi.config;

import org.apache.camel.component.amqp.AMQPComponent;
import org.apache.camel.component.amqp.AMQPConnectionDetails;
import org.apache.qpid.client.AMQConnectionFactory;
import org.apache.qpid.jms.provider.amqp.AmqpConnection;
import org.apache.qpid.url.URLSyntaxException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("be.ozi.*")
public class OZIServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OZIServiceApplication.class, args);

        System.out.println("What was I on.");

    }

//    @Bean
//    public AMQConnectionFactory amqConnectionFactory() throws URLSyntaxException {
//        return new AMQConnectionFactory("amqp://guest:guest@clientid/?brokerlist='tcp://localhost:5672'");
//    }

    @Bean
    public AMQPConnectionDetails securedAmqpConnection() {
        return new AMQPConnectionDetails("amqp://localhost:5672", "guest", "guest");
    }

//    @Bean
//    public AMQPComponent amqpComponent() throws URLSyntaxException {
//        return new AMQPComponent(amqConnectionFactory());
//    }

}
