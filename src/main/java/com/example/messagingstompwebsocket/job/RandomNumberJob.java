package com.example.messagingstompwebsocket.job;

import com.example.messagingstompwebsocket.dto.ContentHolderDTO;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class RandomNumberJob extends QuartzJobBean {
    @Autowired
    private SimpMessagingTemplate template;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        sendRandNumberContent();
    }

    public void sendRandNumberContent(){
        this.template.convertAndSend(
                "/topic/rand-number",
                new ContentHolderDTO(
                        String.format("Random Number %.3f @ %s", Math.random(),
                                LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss")))));
    }
}
