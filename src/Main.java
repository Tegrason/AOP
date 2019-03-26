import com.luxsong.animal.AnimalCglibDynamicProxy;
import com.luxsong.entity.Animal;
import com.luxsong.entity.Dog;

public class Main {

    public static void main(String[] args) {
        testCglibDynamicProxy();
    }
    public static void testCglibDynamicProxy(){
        AnimalCglibDynamicProxy proxy=new AnimalCglibDynamicProxy();
        //这里的参数可以传三种形式01：new Dog().getClass()
        // 02：Class.forName("cn.pb.dao.impl.Dog") 03.Dog.class
        Animal dog= (Animal) proxy.createProxy(new Dog().getClass());
        dog.eat();
        System.out.println("**************************");
        dog.sleep();
    }
}
