package DesignPatterns.AdapterPattern;

public class ClassAdapter {
    public static void main(String[] args) {
        ClassAdapterImpl classAdapter=new ClassAdapterImpl();
        classAdapter.create();
        Adapter adapter=new Adapter();
        ObjectAdapterImpl objectAdapter=new ObjectAdapterImpl(adapter);
        objectAdapter.create();

    }
}

/**
 * ��������
 */
class ClassAdapterImpl extends Adapter implements Product{

    @Override
    public void create() {
        System.out.println("��������");
        super.adapter();
    }
}

/**
 * ����������
 */
class ObjectAdapterImpl implements Product{
    private  Adapter adapter;
    ObjectAdapterImpl(Adapter adapter){
        this.adapter=adapter;
    }
    @Override
    public void create() {
        System.out.println("����������");
       adapter.adapter();
    }
}
