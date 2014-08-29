package demo.dao;

public class User
{
    private String id;
    private String user;
    private String pass;

    public User()
    {
        super();
    }

    // GETTERS / SETTERS
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public String getPass()
    {
        return pass;
    }

    public void setPass(String pass)
    {
        this.pass = pass;
    }

}
