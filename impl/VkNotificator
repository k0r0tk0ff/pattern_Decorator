package com.company.impl;

import com.company.notificator.Notificator;

public class VkNotificator implements Notificator {

    private Notificator notificator;
    private String message = "VK message";

    public VkNotificator(Notificator notificator) {
        this.notificator = notificator;
    }

    @Override
    public String getMessage() {
        return notificator.getMessage() + message;
    }
}
