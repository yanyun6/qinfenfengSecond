package qinfenfengfirst;

public class Animal implements Comparable <Animal> {
    private String specials;
    private String sex;
    private Integer age;
    public  String toString() {
        return specials+" "+sex+" "+age;
    }
    public String getSpecials() {
        return specials;
    }
    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
    public Animal get(){
        return this;//搜的
    }
    public Animal(String specials, String sex, int age) {
        this.specials = specials;
        this.sex = sex;
        this.age = age;
    }


    public static void main(String[] args) {

    }

    @Override
    public int compareTo(Animal o) {

        if(null == this.age) {
            return -1;
        }
        if(null == o.getAge()) {
            return 1;
        }
        return this.age.compareTo(o.getAge());
    }

}