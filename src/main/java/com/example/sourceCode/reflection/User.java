package com.example.sourceCode.reflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: GEEX1428
 * @Date: 2021/2/26 17:02
 * @Description:
 */
public class User {

    private Integer id;
    private String name;


    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Map<String,String> diffUser(Object oldUser, Object newUser) throws IllegalAccessException {
        Map<String,String> diffMap = new HashMap<>();
        Class oldClazz = oldUser.getClass();
        Class newClazz = newUser.getClass();
        if(oldClazz.equals(newClazz)){
            Field[] fields = oldClazz.getDeclaredFields();
            for(Field field : fields){
                field.setAccessible(true);
                Object oldValue = field.get(oldUser);
                Object newValue = field.get(newUser);
                if((oldValue == null && newValue != null) || (oldValue != null && !oldValue.equals(newValue))){
                    System.out.println(field.getName());
                    diffMap.put(field.getName(),"oldValue:"+oldValue+" from to newValue:"+newValue);
                }
            }
        }
        return diffMap;
    }

    public static void main(String[] args) throws IllegalAccessException {
        User user1 = new User(1,"李一");
        User user2 = new User(2,"李二");
        System.out.println(diffUser(user1,user2));
    }
}
