package com.syf.chatbot.kb.repository;

import com.syf.chatbot.kb.entity.RagAudit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RagAuditEntityRepository extends JpaRepository<RagAudit, UUID> {
}
