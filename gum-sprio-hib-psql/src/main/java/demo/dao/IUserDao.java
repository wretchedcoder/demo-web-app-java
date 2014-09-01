package demo.dao;

public interface IUserDao
{
    public int addUser(User user);
    
    public int deleteUser(User user);
    
    public int updateUser(User user);
    
    public User getUser(User user);
    
    public User getUser(String user);
}
