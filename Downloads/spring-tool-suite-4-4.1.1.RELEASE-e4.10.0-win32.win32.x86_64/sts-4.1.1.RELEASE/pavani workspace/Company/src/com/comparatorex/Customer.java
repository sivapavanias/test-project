package com.comparatorex;

public class Customer implements Comparable
{
       int id;
       String name;
       String address;
       
       @Override
       public int hashCode() {
             // TODO Auto-generated method stub
             return this.id;
       }
       @Override
       public boolean equals(Object obj) {
             // TODO Auto-generated method stub
             Customer c=(Customer)obj;
             if(c.id==this.id)
                    return true;
                    else 
                    return false;
       }
       @Override
       public String toString() {
             // TODO Auto-generated method stub
             return this.id+" - "+this.name+" - "+this.address;
       }
       @Override
       public int compareTo(Object o) {
             // TODO Auto-generated method stub
             Customer c=(Customer)o;
             if(this.name.compareTo(c.name)>0)
             {
                    return 1;
             }
             else
             {
                    return -1;
             }
             
       }
       
       
}
