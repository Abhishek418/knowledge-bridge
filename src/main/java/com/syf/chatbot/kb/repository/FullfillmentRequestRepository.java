package com.syf.chatbot.kb.repository;

import com.syf.chatbot.kb.entity.FulfillmentRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FullfillmentRequestRepository extends JpaRepository<FulfillmentRequestEntity, UUID> {
}
