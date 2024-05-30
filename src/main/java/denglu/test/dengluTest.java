package denglu.test;

import denglu.dao.User;
import denglu.jdbc.UserDao;
import org.junit.Test;

public class dengluTest {
    @Test
    public  void denglutest1(){
        User loginusers = new User();
        loginusers.setUsername("康");
        loginusers.setPassword("ypxlkomx");
        UserDao dao =new UserDao();
        User user = dao.login(loginusers);
        System.out.println(user);
    }
}
