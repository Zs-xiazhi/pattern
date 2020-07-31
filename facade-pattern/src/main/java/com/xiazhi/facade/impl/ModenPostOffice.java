package com.xiazhi.facade.impl;

import com.xiazhi.facade.LetterProcess;

/**
 * @author 赵帅
 * @date 2020/7/29
 */
public class ModenPostOffice {

    private LetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address) {
        this.letterProcess.writeContext(context);
        this.letterProcess.fillEnvelope(address);
        this.letterProcess.letterIntoEnvelope();
        this.letterProcess.sendLetter();
    }
}
