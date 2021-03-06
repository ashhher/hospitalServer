package hospitalServer.service;

import hospitalServer.bean.User;
import hospitalServer.controller.UserController;
import hospitalServer.dao.UserDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.bean
 **/
@Service
public class UserServiceImpl implements UserService{
    private static final Logger LOG = Logger.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDao userDao;

    public User login(String id,String pwd) {
        User user = userDao.getUser(id);
        if (user != null )
            if(user.getUserPwd().equals(pwd))
                return user;
            else
                LOG.info("密码错误");
        else
            LOG.info("用户不存在");
        return null;
    }

    public void register(User user) {
        userDao.register(user);
    }


}