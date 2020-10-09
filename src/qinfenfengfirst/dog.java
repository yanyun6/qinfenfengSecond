package qinfenfengfirst;


public class dog extends  Animal{
    public dog (String p,String x,int y ,int weight){
        super(p,x,y);
        this.weight=weight;
    }
    private int weight;

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public String getSex() {
        return super.getSex();
    }

    @Override
    public String getSpecials() {
        return super.getSpecials();
    }

    public int getWeight() {
        return weight;
    }
    public String toString(){
        return getSpecials()+" "+getSex()+" "+getAge()+" "+weight;
    }
}//若添加新的属性，可以再新建动物类的子类