package design.pattern;
// Created by ZG on 15/7/21.
// 工厂模式：根据不同的参数创建对象。
// 比如工厂创建人，我们想要一个男孩，工厂就会创建一个男孩，想要一个女孩，工厂就会创建一个女孩，根据我们提供的参数创建不同的对象。

interface Human{
    public void Talk();
    public void Walk();
}

class Boy implements Human{
    @Override
     public void Walk(){
        System.out.println("Boy is walking");
    }

    @Override
    public void Talk(){
        System.out.println("Boy is talking");
    }
}

class Girl implements Human{
    @Override
    public void Walk(){
        System.out.println("Girl is walking");
    }

    @Override
    public void Talk(){
        System.out.println("Girl is talking");
    }
}

public class HumanFactory {
    public static Human createHuman(String m){
        Human p = null;
        if(m.equals("boy")){
            p = new Boy();
        }
        else if(m.equals("girl")){
            p = new Girl();
        }

        return p;
    }
}
