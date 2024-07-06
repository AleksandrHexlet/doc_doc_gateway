package com.doc_doc.gateway.dto;

public class Order {

    private long id;
    private OrderDirection orderDirection;
    private String criteria;
    private boolean isActive;

    public enum OrderDirection {
        ASCENDING,
        DESCENDING
    }
}
