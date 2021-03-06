package hospitalServer.dao;

import org.springframework.stereotype.Repository;
import hospitalServer.bean.User;

import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.bean
 **/
@Repository
public interface UserDao {
    User getUser(String id);
    void register(User user);
}
