package com.example.Client;

import com.example.mapper.UserMapper;
import com.example.modle.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Auther: GEEX1428
 * @Date: 2021/2/23 17:10
 * @Description:
 */
public class Client3 {


    public void getData(){
        String resource ="mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //多态相当于，SqlSession session = new DefaultSqlSession();
        //其中SqlSession为接口，DefaultSqlSessio为其实现类。方法里面定义了，查询，插入，修改，删除，提交，回滚等大量方法。
        try (SqlSession session = sqlSessionFactory.openSession()){
            UserMapper userMapper = session.getMapper(UserMapper.class);
            User user = new User();
            user.setLoginName("admin");
            List<User> list = userMapper.selectByLoginName(user);
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        Client3 client3 = new Client3();
        client3.getData();
    }
}
