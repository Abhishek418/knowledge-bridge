package com.syf.chatbot.kb.controller;

import org.springframework.ai.document.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/kb/rag")
public class RagController {

    @GetMapping("/getContext")
    public List<Document> getContextForQuery(@RequestBody String query){
        return null;
    }
}
