package com.syf.chatbot.kb.entity;

import com.syf.chatbot.kb.dto.LexFulfillmentRequest;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "rag_audit_entity")
public class RagAuditEntity {

    @Id
    @Column(name = "rag_audit_id")
    private UUID ragAuditId;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "rag_audit_id")
    private LexFulfillmentRequest fulfillmentRequest;

    @Column(name = "retrieved_context", columnDefinition = "jsonb")
    private String retrievedContext;

    @Column(name = "llm_prompt", columnDefinition = "TEXT")
    private String llmPrompt;

    @Column(name = "llm_response", columnDefinition = "TEXT")
    private String llmResponse;

    @Column(name = "execution_ms")
    private Integer executionMs;

    @Column(name = "created_at", updatable = false)
    private Instant createdAt = Instant.now();
}