package lab4;

public class driver{
public static void main(String[] args){
bread b1 = new bread();
bread b2 = new cake();
bread b3 = new pastry();
cake c1 = new cake();
cake c2 = new pastry();
pastry p1 = new pastry();
//various functions of b1
System.out.println("b1");
b1.leaveUnattended();
b1.cook();
//b1.knead();
b1.eat();
//various functions of b2
System.out.println("b2");
b2.leaveUnattended();
b2.cook();
b2.eat();
//b2.decorate();
//various functions of b3
System.out.println("b3");
b3.leaveUnattended();
b3.cook();
b3.eat();
//b3.decorate();
//b3.eatFrosting();
//various functions of c1
System.out.println("c1");
c1.leaveUnattended();
c1.cook();
c1.eat();
c1.decorate();
//various functions of c2
System.out.println("c2");
c2.leaveUnattended();
c2.cook();
c2.eat();
c2.decorate();
//c2.eatFrosting();
//various functions of p1
System.out.println("p1");
p1.leaveUnattended();
p1.cook();
p1.eat();
p1.decorate();
p1.eatFrosting();
}
}
//questions to think about
//why haven't we overridden the functions knead(), cook() and leaveUnattended()
//what does the final method cook tell you about the bakery
//what does the static keyword tell you about the nature of bread
//can we call knead() on any object other than b1?
//what do you learn from the various calls of eat()
//how do you find out which implementation of eat() is called

