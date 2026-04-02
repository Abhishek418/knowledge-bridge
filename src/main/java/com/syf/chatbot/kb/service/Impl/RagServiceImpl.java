package com.syf.chatbot.kb.service.Impl;

import com.syf.chatbot.kb.service.IRagService;

import javax.swing.text.Document;
import java.util.List;

public class RagServiceImpl implements IRagService {
    @Override
    public List<Document> getContextForQuery(String userQuery) {
        return List.of();
    }
}
