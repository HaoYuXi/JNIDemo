package com.example.app.jnidemo;

public class User
{
    public User()
    {
    }

    public User(String name)
    {
        this.name = name;
    }

    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
