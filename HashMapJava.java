import java.util.HashMap;

public class HashMapJava{
    public static void main(String[] args) {

        HashMap<Integer,String> carros = new HashMap<Integer, String>();

        carros.put(1,"Polo");
        carros.put(2,"HRV");
        carros.put(3,"Golf");
        carros.put(4,"Camaro");
        carros.put(5,"Mustang");
        carros.put(6,"Cruze");

        //System.out.println(carros);
        //System.out.println(carros.get(1));
        //for(int i=1;i<=carros.size();i++){
        //    System.out.println(carros.get(i));
        //}

        carros.remove(5); //remove a chave 5
        carros.clear(); //remove toda a coleção

        for(String c : carros.values()){ //foreach com HashMap
            System.out.println(c);
        }


        

    }
}