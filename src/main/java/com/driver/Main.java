package com.driver;

class A{
    public String meth()
    {
        return "Invoking method from class A";
    }
}

class B{
    public String meth()
    {
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args)
    {
        B obj=new  B();
        System.out.println(obj.meth());
    }
  
}