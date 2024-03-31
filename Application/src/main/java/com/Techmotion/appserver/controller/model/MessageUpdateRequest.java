package com.Techmotion.appserver.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageUpdateRequest {
    @JsonProperty("content")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



}
