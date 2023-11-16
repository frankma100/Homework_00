package hw5;

public class MyRectangleMain {

    public static void main(String[] args) {
        // 使用不帶參數的建構子
        MyRectangle rectangle1 = new MyRectangle();
        rectangle1.setWidth(5.0);
        rectangle1.setDepth(20.0);
        System.out.println("使用不帶參數建構子，面積：" + rectangle1.getArea());

        // 使用帶參數的建構子
        MyRectangle rectangle2 = new MyRectangle(5.0, 20.0);
        System.out.println("使用帶參數建構子，面積：" + rectangle2.getArea());
    }
}