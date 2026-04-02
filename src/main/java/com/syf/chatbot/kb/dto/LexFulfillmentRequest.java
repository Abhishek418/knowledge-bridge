package com.syf.chatbot.kb.dto;

import java.util.Map;

public record LexFulfillmentRequest(
        String inputMessage,
        String conversationId,
        RequestSessionState sessionState
) {
    public record RequestSessionState(
            Intent intent
    ) {}

    public record Intent(
            String name,
            String state,
            Map<String, Object> slots
    ) {}
}