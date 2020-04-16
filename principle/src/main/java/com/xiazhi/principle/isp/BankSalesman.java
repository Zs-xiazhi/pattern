package com.xiazhi.principle.isp;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/13
 **/
public class BankSalesman implements Bank {

    @Override
    public void saving() {
        System.out.println("存款");
    }

    @Override
    public void fetch() {
        System.out.println("取款");
    }

    @Override
    public void transfer() {
        System.out.println("转账");
    }

    @Override
    public void manageMoney() {
        System.out.println("理财");
    }

    public static void main(String[] args) {
        String elString = "{money>=2000&&money<=4000}";
        String elValue = "3000";
        String el = elString.substring(elString.indexOf("{")+1, elString.indexOf("}"));
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        engine.put("money",elValue);
        boolean eval = false;
        try {
            eval = (boolean) engine.eval(el);
        } catch (ScriptException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(eval);
    }
}
