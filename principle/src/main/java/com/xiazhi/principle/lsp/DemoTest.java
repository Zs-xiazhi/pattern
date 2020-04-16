package com.xiazhi.principle.lsp;

/**
 * @author ZhaoShuai
 * @date Create in 2020/4/12
 **/
public class DemoTest {

    public static void main(String[] args) {
        System.out.println("============长方形==============");
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        test(rectangle);

        System.out.println("============正方形==============");
        Rectangle square = new SquareExtendsRectangle();
        square.setHeight(10);
        test(square);

    }

    private static void print(Rectangle rectangle) {
        System.out.println("高："+rectangle.getHeight());
        System.out.println("宽：" + rectangle.getWidth());
    }

    private static void test(Rectangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight()+1);
            print(rectangle);
        }
    }
}
