package com.kat.onlinechat.client;

import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Utilities {
    public static final Color TRANSPARENT_COLOR = new Color(0, 0, 0, 0);
    public static final Color PRIMARY_COLOR = Color.decode("#b5ccf8");
    public static final Color SECONDARY_COLOR = Color.decode("#e7e9ed");
    public static final Color TEXT_COLOR = Color.decode("#7f8695");

    public static EmptyBorder addPadding(int top, int left, int bottom, int right){
        return new EmptyBorder(top, left, bottom, right);
    }
}
