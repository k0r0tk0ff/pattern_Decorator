package com.company;

import com.company.impl.NotificatorImpl;
import com.company.impl.SmsNotificator;
import com.company.impl.VkNotificator;
import com.company.impl.ZabbixNotificator;
import com.company.notificator.Notificator;

public class Main {

    public static void main(String[] args) {

        Notificator notificator = new NotificatorImpl();
        notificator = new SmsNotificator(notificator);
        notificator = new ZabbixNotificator(notificator);
        notificator = new VkNotificator(notificator);

        System.out.println(notificator.getMessage());
    }
}
