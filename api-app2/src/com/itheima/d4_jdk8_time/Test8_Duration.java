// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   Test8_Duration.java

package com.itheima.d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class Test8_Duration {
    public static void main(String args[])
    {
        LocalDateTime localdatetime = LocalDateTime.of(2025, 11, 11, 11, 10, 10);
        LocalDateTime localdatetime1 = LocalDateTime.of(2025, 11, 11, 11, 11, 11);
        Duration duration = Duration.between(localdatetime, localdatetime1);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
