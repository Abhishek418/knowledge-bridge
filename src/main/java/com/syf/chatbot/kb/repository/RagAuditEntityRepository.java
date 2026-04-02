package com.syf.chatbot.kb.repository;

import com.syf.chatbot.kb.entity.RagAuditEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RagAuditEntityRepository extends JpaRepository<RagAuditEntity, UUID> {
}
