package com.xiazhi.principle.lsp;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public class SquareExtendsRectangle extends Rectangle {

    private Integer side;

    @Override
    public void setHeight(Integer height) {
        this.setSide(height);
    }

    @Override
    public void setWidth(Integer width) {
        this.setSide(width);
    }

    @Override
    public Integer getHeight() {
        return this.getSide();
    }

    @Override
    public Integer getWidth() {
        return this.getSide();
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }
}
