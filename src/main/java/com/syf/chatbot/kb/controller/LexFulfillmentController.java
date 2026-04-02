package com.syf.chatbot.kb.controller;

import com.syf.chatbot.kb.dto.LexFulfillmentRequest;
import com.syf.chatbot.kb.dto.LexFulfillmentResponse;
import com.syf.chatbot.kb.service.IKnowledgeOrchestratorService;
import com.syf.chatbot.kb.service.Impl.KnowledgeOrchestratorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/kb/lex")
@RequiredArgsConstructor
public class LexFulfillmentController {

    private final IKnowledgeOrchestratorService kbService;

    public LexFulfillmentController(KnowledgeOrchestratorServiceImpl kbService){
        this.kbService = kbService;
    }

    @PostMapping(value = "/fulfillment", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LexFulfillmentResponse> handleLexWebhook(@RequestBody LexFulfillmentRequest lexRequest) {
        // 1. Extract inputTranscript and sessionId
        // 2. Call Service -> Spring AI -> Redis -> OpenAI
        // 3. Save to RagAuditEntity
        // 4. Return formatted LexAction response

        LexFulfillmentResponse response = kbService.processQuery(lexRequest);
        return ResponseEntity.ok(response);
    }
}