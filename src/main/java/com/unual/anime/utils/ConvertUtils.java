package com.unual.anime.utils;

public class ConvertUtils {
    public static final int PAGE = 0;
    public static final int LIMIT = 20;

    public static int toIntUnsigned(int defaultNumber, String number) {
        int page = defaultNumber;
        try {
            page = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (page < 0) page = 0;
        return page;
    }
}
