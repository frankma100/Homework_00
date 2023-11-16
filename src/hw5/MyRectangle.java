package hw5;

public class MyRectangle {

    private double width;
    private double depth;

    // 不帶參數的建構子
    public MyRectangle() {
        // 可以不做任何事情，因為屬性會被自動初始化為0.0
    }

    // 帶有兩個參數的建構子
    public MyRectangle(double width, double depth) {
        this.width = width;
        this.depth = depth;
    }

    // 設定寬度
    public void setWidth(double width) {
        this.width = width;
    }

    // 設定深度
    public void setDepth(double depth) {
        this.depth = depth;
    }

    // 計算長方形面積
    public double getArea() {
        return width * depth;
    }

    public static void main(String[] args) {
        // 使用範例
        MyRectangle rectangle1 = new MyRectangle(); // 使用無參數建構子
        rectangle1.setWidth(3.0);
        rectangle1.setDepth(20.0);
        System.out.println("面積：" + rectangle1.getArea());

        MyRectangle rectangle2 = new MyRectangle(4.0, 5.5); // 使用帶參數建構子
        System.out.println("面積：" + rectangle2.getArea());
    }
}