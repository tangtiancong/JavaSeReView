package DesignPatterns;


/**
 * 单例模式：1：单例对象只存在一个实例，2：实例必须由单例类提供的方法创建，3：单例类提供方法供其他类访问该实例
 * 懒汉模式：在获取对象实例时创建  ，饿汉模式：类加载时创建
 */
public class  SingleTest{
    public static void main(String[] args) {
        SingleLazyExample singleLazyExample=SingleLazyExample.getSingleLazyExample();
        SingleLazyExample singleLazyExample1=SingleLazyExample.getSingleLazyExample();
        SingleHungryExample SingleHungryExample= DesignPatterns.SingleHungryExample.getSingleExample();
        SingleHungryExample SingleHungryExample1= DesignPatterns.SingleHungryExample.getSingleExample();
        System.out.println(singleLazyExample==singleLazyExample1); //判断是否同一对象
        System.out.println(SingleHungryExample==SingleHungryExample1);//判断是否同一对象
    }
}

//饿汉模式
class SingleHungryExample {
    private static SingleHungryExample singleHungryExample=new SingleHungryExample();

    public static SingleHungryExample getSingleExample() {
        return singleHungryExample;
    }

    private  SingleHungryExample(){

    }
}
//懒汉模式
 class SingleLazyExample{
    private static volatile SingleLazyExample singleLazyExample=null; //保证数据可见性
    private  SingleLazyExample(){}

    public synchronized static SingleLazyExample getSingleLazyExample() { //保证线程安全
        if(singleLazyExample==null){
            singleLazyExample=new SingleLazyExample();
        }
        return singleLazyExample;
    }
}
