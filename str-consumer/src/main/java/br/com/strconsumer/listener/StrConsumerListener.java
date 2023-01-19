package br.com.strconsumer.listener;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @KafkaListener(groupId = "group-1",topics = "str-topic",containerFactory = "srtContainerFactory")
    public void listener(String message){
        log.info("LISTENER ::: Mensagem recebida{}", message );
    }

    @KafkaListener(groupId = "group-1",topics = "str-topic",containerFactory = "srtContainerFactory")
    public void create(String message){
        log.info("CREATE ::: Mensagem recebida{}", message );
    }

    @KafkaListener(groupId = "group-2",topics = "str-topic",containerFactory = "srtContainerFactory")
    public void history(String message){
        log.info("HISTORY ::: Mensagem recebida{}", message );
    }
}
