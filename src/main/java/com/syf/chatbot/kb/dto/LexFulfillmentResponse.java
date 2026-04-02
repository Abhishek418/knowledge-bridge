package com.syf.chatbot.kb.dto;

import java.util.List;

public record LexFulfillmentResponse(
        ResponseSessionState sessionState,
        List<Message> messages
) {
    public record ResponseSessionState(
            DialogAction dialogAction
    ) {}

    public record DialogAction(
            String type
    ) {}

    public record Message(
            String contentType,
            String content
    ) {}
}