package dev.knowledgecafe.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/")
public class DemoController {

    @Value("${db.name}")
    private String dbName;

    @GetMapping(value = "/db")
    public String getDBName(){
        return String.format("Currently configured Database is  %s", dbName);
    }
}
