package bitsoop.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Test{
    public static void main(String[] args) {
        List<Account> al = new ArrayList<Account>();
        al.add(new Account(111,"Ankit",5000));
        al.add(new Account(112,"Ashok",4000));
        al.add(new Account(123,"Ryan",5000));
                Collections.sort(al);
        for(Account a:al)
            System.out.println(a);
    }
}

class Account implements Comparable<Account>{
    int acc;
    String name;
    float amt;
    Account(int acc,String name,float amt){
        this.acc = acc;
        this.name = name;
        this.amt = amt; }
    public int compareTo(Account ac){
        if(amt==ac.amt)
            return 0;
        else if(amt>ac.amt)
            return 1;
        else
            return -1; }
    public String toString() {
        return "Acc. No.: "+acc+" Name: "+name+" Amount: "+amt;}
}