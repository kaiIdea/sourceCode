package com.example.sourceCode.reflection;

/**
 * @Auther: GEEX1428
 * @Date: 2021/2/26 16:48
 * @Description:
 */
public class StudentDecorator implements Pepole {

    private Pepole user;

    public StudentDecorator(Pepole user) {
        this.user = user;
    }

    @Override
    public String getName() {
        recording(this.user.getName());
        return null;
    }

    @Override
    public String getAddress() {
        recording(this.user.getAddress());
        return null;
    }

    public void recording(String context){
        System.out.println("记录下来了:"+context);
    }


    public static void main(String[] args) {
        Pepole user = new Student();
        Pepole user1 = new StudentDecorator(user);
        user1.getName();
        user1.getAddress();
    }
}
