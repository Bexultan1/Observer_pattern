import java.util.ArrayList;

public class Shop implements Observer{
    private String name;
    private ArrayList<Client> clients = new ArrayList<>();
    public Shop(String name){
        this.name = name;
    }

    public void addSub(Client sub){
        clients.add(sub);
    }
    public void removeSub(Client sub){
        clients.remove(sub);
    }


    @Override
    public void notifyClients() {
        for (Client client : clients){
            client.update();
        }
    }

    public String getName() {
        return name;
    }

    public void launchNewProduct(){
        notifyClients();
    }
}
