package com.croakzh.core.utils;

import java.util.regex.Pattern;

/**
 * @author croakzh
 */
public class ParseUtils {

    public static final Pattern whitespacesColonWhitespace = Pattern.compile("\\s+:\\s");

    public static final Pattern whitespacesColonLastWhitespace = Pattern.compile(":\\s");

    public static final Pattern whitespaces = Pattern.compile(":\\s+");

}
