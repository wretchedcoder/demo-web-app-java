package demo.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.dao.IUserDao;
import demo.dao.User;

@Controller
@RequestMapping(value = "/users")
public class UserController implements ApplicationContextAware
{
    private ApplicationContext appCtx;
    
    public String login(User user)
    {
    	IUserDao userDao = (IUserDao)this.appCtx.getBean("userDao");
    	
    	String username = user.getUser();
    	String password = user.getPass();
    	
    	User validUser = userDao.getUser(username);
    	
    	if (validUser == null)
    	{
    		return "index";
    	}
    	else
    	{
    		return "userhome";
    	}    	
    }    
    
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException
    {
        this.appCtx = applicationContext;        
    }   
}
