package com.syf.chatbot.kb.service;

import javax.swing.text.Document;
import java.util.List;

public interface IRagService {
    public List<Document> getContextForQuery(String userQuery);
}
