public class Client {
    private String name;
    private Shop shop;
    public Client(String name){
        this.name = name;
    }

    public void getNewsFrom(Shop shop){
        this.shop = shop;
    }

    public void update(){
        System.out.println(name + ", shop " + shop.getName() + " uploaded a new item!");
    }

}
