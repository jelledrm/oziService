package be.ozi.qpid;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QpidConsumerRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("amqp:queue:test")
//            .process(exchange -> {
//                Object messageBody = exchange.getIn().getBody();
//                System.out.println(messageBody.toString());
//            })
            .to("log:output")
            .process(exchange -> {
                exchange.getIn().setBody("Your data.");
            })
            .to("log:output");
    }
}
