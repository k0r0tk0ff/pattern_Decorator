package com.company.impl;

import com.company.notificator.Notificator;

public class ZabbixNotificator implements Notificator{

    private String customDate = " Zabbix ";
    private Notificator notificator;

    public ZabbixNotificator (Notificator notificator) {
        this.notificator = notificator;
    }

    @Override
    public String getMessage() {
        return String.format("%s%s", notificator.getMessage(), customDate);
    }
}
