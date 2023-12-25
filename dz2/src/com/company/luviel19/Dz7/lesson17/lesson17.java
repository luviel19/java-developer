import java.util.*;

public class lesson17 {
    public static void main(String[] args) {
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("Москва", 790);
        customers.put("Ростов", 250);
        customers.put("Новгород", 20);
        customers.put("Ростов", 300);
        customers.put("Самара", 350);
        customers.put(null, 350);
        customers.put(null, 1000);
        System.out.println(customers.size());//5
        System.out.println(customers.isEmpty());//false потому - что не пустая

        customers.remove(null);// удаление пары по ключю
        //удалит если в мапе существует пара "Ростов",300
        customers.remove("Ростов", 350); //true
        customers.remove("Самара", 340); //false
        System.out.println(customers.size());

        customers.replace("Самара", 1200);
        customers.replace("Москва", 790, 840);

        System.out.println(customers.get("Москва"));
        System.out.println(customers.get("СПБ"));

        System.out.println(customers.getOrDefault("Москва", -1));
        System.out.println(customers.getOrDefault("СПБ", -1));
        Integer spbValue = customers.getOrDefault("СПБ", -1);
        if (spbValue == -1) {
            System.out.println("rt");
        } else {
            System.out.println(spbValue);
        }
        if (customers.containsKey("Ростов")) {
            System.out.println("Информация О ростове уже содеожмться");
        }
        if (customers.containsValue(1000)) {
            System.out.println("Количество 1000 содержится в мапе");
        }
        Collection<Integer> customersValues = customers.values();
        Set<String> customersKays = customers.keySet();
        Set<Map.Entry<String, Integer>> customersPairs = customers.entrySet();

        for (Map.Entry<String, Integer> customersPair : customersPairs) {
            System.out.println(customersPair.getValue() + " " + customersPair.getKey());
            if (customersPair.getValue() > 1000) {
                System.out.println("В городе " + customersPair.getKey() + "Кол-во покупателей больше 1000");
            }
        }
        ArrayList<String> cities = getCities(customers,500);
        System.out.println(cities);

        EnumMap<ClientAuthData.Role,List<ClientAuthData>> clientsByRile =new EnumMap<>(ClientAuthData.Role.class);

        clientsByRile.put(ClientAuthData.Role.USER, new ArrayList<>());
        clientsByRile.put(ClientAuthData.Role.ADMIN, new ArrayList<>());
        clientsByRile.put(ClientAuthData.Role.MODERATOR, new ArrayList<>());

        ClientAuthData data01 = new ClientAuthData("qqq",123, ClientAuthData.Role.USER);

 clientsByRile.get(ClientAuthData.Role.USER).add(data01);

        System.out.println(clientsByRile.size());


    }

    private static ArrayList<String> getCities(HashMap<String, Integer> map, int max) {
        ArrayList<String> cities = new ArrayList<>();
        for(Map.Entry<String,Integer>keyValuePair : map.entrySet()){
            if (keyValuePair.getValue() < max){
            cities.add(keyValuePair.getKey());

        }
    }
return cities;




        public static void add(EnumMap<ClientAuthData.Role,List<ClientAuthData>> map,ClientAuthData authData){
            if (map.get(authData.getRole())==null){
                map.put(authData.getRole(),new ArrayList<>());
            }
            map.get(authData.getRole()).add(authData);

        }




    }

