package com.xiazhi.facade.impl;

import com.xiazhi.facade.LetterProcess;

/**
 * @author 赵帅
 * @date 2020/7/29
 */
public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println(String.format("填写信的内容：%s", context));
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println(String.format("填写收件人地址及姓名:%s", address));
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封中");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件");
    }
}
