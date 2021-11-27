package jike_week4;

interface TakeOutCall {
    void deliverFood ();
}
class Noshery implements TakeOutCall{
    private Customer customer;

    public Noshery(Customer customer){
        this.customer=customer;
    }

    public void propaganda(){
        System.out.println("新品特惠，买一送一！！！！！！");
        System.out.println("可拨打电话订餐：13364061620");
        customer.ordering(this);
    }

    @Override
    public void deliverFood() {
        System.out.println("您的订单正在准备，即将为你送出，请稍后。");
    }
}

class Customer{

    public void ordering(TakeOutCall takeOutCall){
       System.out.println("<顾客接收宣传单储存>");
       System.out.println("<顾客打电话订餐>");
       System.out.println("我要螺蛳粉，加臭加辣那种！！！！！");
       takeOutCall.deliverFood();
   }
}

public class Lv3 {
    public static void main(String[] args){
        Noshery noshery = new Noshery(new Customer());
        noshery.propaganda();
    }
}