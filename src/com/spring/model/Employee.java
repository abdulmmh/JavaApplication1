
package com.spring.model;

import java.util.List;


public class Employee {
    private int id;
    private String name;
    private Address addr;
    private List<Address> addrs;

    public Employee() {
    }
    
    

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Address> getAddrs() {
        return addrs;
    }

    public void setAddrs(List<Address> addrs) {
        this.addrs = addrs;
    }

    public Employee(int id, String name, Address addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public Employee(int id, String name, Address addr, List<Address> addrs) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.addrs = addrs;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void showEmployee(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println( addr);
        for (Address addr1 : addrs) {
            System.out.println(addr1);
        }
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
    
}
