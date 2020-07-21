package DesignPatterns;


/**
 * ����ģʽ��1����������ֻ����һ��ʵ����2��ʵ�������ɵ������ṩ�ķ���������3���������ṩ��������������ʸ�ʵ��
 * ����ģʽ���ڻ�ȡ����ʵ��ʱ����  ������ģʽ�������ʱ����
 */
public class  SingleTest{
    public static void main(String[] args) {
        SingleLazyExample singleLazyExample=SingleLazyExample.getSingleLazyExample();
        SingleLazyExample singleLazyExample1=SingleLazyExample.getSingleLazyExample();
        SingleHungryExample SingleHungryExample= DesignPatterns.SingleHungryExample.getSingleExample();
        SingleHungryExample SingleHungryExample1= DesignPatterns.SingleHungryExample.getSingleExample();
        System.out.println(singleLazyExample==singleLazyExample1); //�ж��Ƿ�ͬһ����
        System.out.println(SingleHungryExample==SingleHungryExample1);//�ж��Ƿ�ͬһ����
    }
}

//����ģʽ
class SingleHungryExample {
    private static SingleHungryExample singleHungryExample=new SingleHungryExample();

    public static SingleHungryExample getSingleExample() {
        return singleHungryExample;
    }

    private  SingleHungryExample(){

    }
}
//����ģʽ
 class SingleLazyExample{
    private static volatile SingleLazyExample singleLazyExample=null; //��֤���ݿɼ���
    private  SingleLazyExample(){}

    public synchronized static SingleLazyExample getSingleLazyExample() { //��֤�̰߳�ȫ
        if(singleLazyExample==null){
            singleLazyExample=new SingleLazyExample();
        }
        return singleLazyExample;
    }
}
