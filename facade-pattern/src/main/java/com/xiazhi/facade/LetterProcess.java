package com.xiazhi.facade;

/**
 * 定义一个写信的过程
 * @author 赵帅
 * @date 2020/7/29
 */
public interface LetterProcess {

    /**
     * 定义写信的内容
     * @param context
     */
    void writeContext(String context);

    /**
     * 写信封
     * @param address
     */
    void fillEnvelope(String address);

    /**
     * 将信放入信封
     */
    void letterIntoEnvelope();

    /**
     * 邮寄
     */
    void sendLetter();
}
