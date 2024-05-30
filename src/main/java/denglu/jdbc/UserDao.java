package denglu.jdbc;

import denglu.dao.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    //声明JdbcTemplate对象共用
    private JdbcTemplate template = new JdbcTemplate(denglu.jdbc.JdbcUtils.getDataSource());

    //登录方法
    public User login(User loginuser) {
        try {
            String sql = "select * from student where username = ? and password = ?";
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginuser.getUsername(), loginuser.getPassword());
            return user;
        } catch (DataAccessException e) {
            return null;
        }
    }
}
