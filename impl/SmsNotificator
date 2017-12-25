package com.company.impl;

import com.company.notificator.Notificator;

public class SmsNotificator implements Notificator {

    private String customDate = " SMS ";
    private Notificator notificator;

    public SmsNotificator (Notificator notificator) {
        this.notificator = notificator;
    }

    @Override
    public String getMessage() {
        return String.format("%s%s", notificator.getMessage(), customDate);
    }
}
