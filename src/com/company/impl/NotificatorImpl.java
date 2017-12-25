package com.company.impl;

import com.company.notificator.Notificator;

public class NotificatorImpl implements Notificator {

    String message = " Base message ";
    @Override
    public String getMessage() {
        return message;
    }
}
