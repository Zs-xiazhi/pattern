package com.xiazhi.decorator;

import java.util.Objects;
import java.util.Optional;

/**
 * @author 赵帅
 * @date 2020/7/9
 */
public class DemoTest {
    public static void main(String[] args) {
        String activeData = null;
        String s = Optional.ofNullable(activeData)
                .filter(f -> f==null||f.matches("\\d{4}\\/(0?[1-9]|[1][012])\\/(0?[1-9]|[12][0-9]|3[01])"))
                .orElseThrow(() -> new IllegalArgumentException("不规范"));
        System.out.println("s = " + s);

    }
}
