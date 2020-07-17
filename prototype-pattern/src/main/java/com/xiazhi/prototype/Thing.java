package com.xiazhi.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 赵帅
 * @date 2020/7/8
 */
public class Thing implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<>();

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public List<String> getValue() {
        return this.arrayList;
    }

    @Override
    protected Thing clone()  {
        try {
            Thing clone = (Thing) super.clone();
            clone.arrayList = (ArrayList<String>) this.arrayList.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
