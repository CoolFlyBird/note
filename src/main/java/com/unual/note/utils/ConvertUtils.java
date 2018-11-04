package com.unual.note.utils;

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

    public static String toQueryString(String string) {
        if (string == null || string.length() == 0) {
            return "\"%\"";
        } else {
            return "\"%" + string + "%\"";
        }
    }
}
