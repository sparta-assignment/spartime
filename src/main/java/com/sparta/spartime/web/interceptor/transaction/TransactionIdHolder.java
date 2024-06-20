package com.sparta.spartime.web.interceptor.transaction;

import java.util.UUID;

public class TransactionIdHolder {
    private static final ThreadLocal<String> trIdThreadLocal = new ThreadLocal<>();

    public static void setTrId(String transactionId) {
        trIdThreadLocal.set(transactionId);
    }

    public static String getTrId() {
        return trIdThreadLocal.get();
    }

    public static void clear() {
        trIdThreadLocal.remove();
    }

    public static String generateTransactionId() {
        return UUID.randomUUID().toString();
    }
}
