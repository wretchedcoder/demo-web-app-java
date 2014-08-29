package demo.dao;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/users")
public class UserModel implements ApplicationContextAware
{
    private ApplicationContext appCtx;
    

    
    
    
    
    
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException
    {
        this.appCtx = applicationContext;        
    }

   
}
