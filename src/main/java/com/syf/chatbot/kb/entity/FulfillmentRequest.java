package com.syf.chatbot.kb.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "fulfillment_request")
public class FulfillmentRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "message_id", unique = true)
    private String messageId;

    @Column(name = "conversation_id")
    private UUID conversationId;

    @Column(name = "sender", length = 50)
    private String sender;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "lex_intent", length = 100)
    private String lexIntent;

    @Column(name = "created_at", updatable = false)
    private Instant createdAt = Instant.now();

    @OneToOne(mappedBy = "fulfillmentRequest", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private RagAudit ragAudit;

}