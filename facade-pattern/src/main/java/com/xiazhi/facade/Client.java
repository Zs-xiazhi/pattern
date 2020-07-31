package com.xiazhi.facade;

import com.xiazhi.facade.impl.LetterProcessImpl;

/**
 * @author 赵帅
 * @date 2020/7/29
 */
public class Client {
    public static void main(String[] args) {
        LetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("hello ,It's me ,do you know who I am?");
        letterProcess.fillEnvelope("上海市浦东新区，张三");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();

    }
}
