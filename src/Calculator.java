// Created by ZG on 15/7/4.
// 线程的创建和运行

//  创建一个名为Calculator的类，这个类要实现Runnable接口
public class Calculator implements Runnable{

    // 声明一个名为number 的private int为属性，然后实现构造函数并初始化其值
    private int number;
    public Calculator(int number){
        this.number = number;
    }

    // 实现run()方法. 这方法是给我们创建的线程执行指令，所以这个方法将计算数字乘法表
    @Override
    public void run(){
        for (int i=1; i<=10; i++){
            System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), number, i, i * number);
        }
    }
    // 实现程序的Main类
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            Calculator calculator = new Calculator(i);
            Thread thread = new Thread(calculator);
            thread.start();
        }
    }
}
