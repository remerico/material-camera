package com.afollestad.materialcamera.util;

import android.os.Build;

/**
 * This class exists to provide a place to define device specific information as some
 * manufacturers/devices require specific camera setup/requirements.
 */
public class ManufacturerUtil {

    public ManufacturerUtil() {}

    // Samsung device info
    private static final String SAMSUNG_MANUFACTURER = "samsung";

    // Samsung Galaxy S3 info
    private static final String SAMSUNG_S3_DEVICE_COMMON_PREFIX = "d2";
    public static final Integer SAMSUNG_S3_PREVIEW_WIDTH = 640;
    public static final Integer SAMSUNG_S3_PREVIEW_HEIGHT = 480;

    // Samsung Galaxy S7 info
    private static final String SAMSUNG_S7_DEVICE_COMMON_PREFIX = "herolte";
    public static final Integer SAMSUNG_S7_PREVIEW_WIDTH = 640;
    public static final Integer SAMSUNG_S7_PREVIEW_HEIGHT = 480;


    // LG device info
    private static final String LG_MANUFACTURER = "LGE";
    private static final String LG_G33_DEVICE_COMMON_PREFIX = "g3";


    // Samsung Galaxy helper functions
    public static boolean isSamsungDevice() {
        return SAMSUNG_MANUFACTURER.equals(Build.MANUFACTURER.toLowerCase());
    }

    public static boolean isSamsungGalaxyS3() {
        return Build.DEVICE.startsWith(SAMSUNG_S3_DEVICE_COMMON_PREFIX);
    }

    public static boolean isSamsungGalaxyS7() {
        return Build.DEVICE.startsWith(SAMSUNG_S7_DEVICE_COMMON_PREFIX);
    }

    public static boolean isLGG3Device() {
        return LG_MANUFACTURER.equalsIgnoreCase(Build.MANUFACTURER) &&
                Build.DEVICE.startsWith(LG_G33_DEVICE_COMMON_PREFIX);
    }

    public static boolean hasNoCamera2Support() {

        // Disable Camera2 support for now.
        return true;

        //return isSamsungDevice() || isLGG3Device();

    }

}
