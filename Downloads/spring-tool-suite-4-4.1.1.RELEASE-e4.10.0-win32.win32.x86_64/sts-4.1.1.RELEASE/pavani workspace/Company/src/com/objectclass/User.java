package com.objectclass;
public class User {

public int userid;
String name;
String address;
public int age;
String username;
String password;

//@Override
/*public String toString() {
// TODO Auto-generated method stub
return this.userid+" "+this.name+" "+this.address+" "+this.age;
}
@Override
public Object clone() throws CloneNotSupportedException {
// TODO Auto-generated method stub
User us=new User();
us.age=this.age+this.userid;
return us;
}
@Override
public int hashCode() {
int result=age+userid;

return result;
}
*/
@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
User other = (User) obj;
if (address == null) {
if (other.address != null)
return false;
} else if (!address.equals(other.address))
return false;
if (age != other.age)
return false;
if (name == null) {
if (other.name != null)
return false;
} else if (!name.equals(other.name))
return false;
if (password == null) {
if (other.password != null)
return false;
} else if (!password.equals(other.password))
return false;
if (userid != other.userid)
return false;
if (username == null) {
if (other.username != null)
return false;
} else if (!username.equals(other.username))
return false;
return true;
}


}