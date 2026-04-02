package com.syf.chatbot.kb.service;

import com.syf.chatbot.kb.dto.LexFulfillmentRequest;
import com.syf.chatbot.kb.dto.LexFulfillmentResponse;

public interface IKnowledgeOrchestratorService {

    LexFulfillmentResponse processQuery(LexFulfillmentRequest lexRequest);
}
