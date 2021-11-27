package jike_week3;

class Address{
    String nation;
    String province;
    String city;
    String street;
    String zipcode;
    public Address(String nation,String province,String city,String street,String zipcode){
        System.out.println("国家:"+ nation);
        System.out.println("省份:"+ province);
        System.out.println("城市:"+ city);
        System.out.println("街道:"+ street);
        System.out.println("邮编:"+ zipcode);
    }
};
public class Lv1{
    public static void main(String[] args){
    Address address = new Address("中国","重庆","南岸区","南山街道","400000");
    }
}
