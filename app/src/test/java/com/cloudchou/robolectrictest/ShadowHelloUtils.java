package com.cloudchou.robolectrictest;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

/**
 * Created by Cloud on 2016/7/1.
 */
@Implements(HelloUtils.class)
public class ShadowHelloUtils {

    @Implementation
    public static void test() {
        System.out.println("Hello baby");
    }

}
