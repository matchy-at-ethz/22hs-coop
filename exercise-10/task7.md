# Task 7

## A

What is a topological invariant?

--> ????

```java
class A {
    rep String value;
}

class B {
    peer A a;
    rep String value;

    void foo () {
        a.value = value;
        // LHS is peer.rep == lost
        // RHS is rep
        // both A and B has a rep reference to the string
        // now both A and B owns the string now
        // which is not desired
    }
}
```

Another example:
(anything that makes the `rep` relationship not a tree )

```java
class C {
    rep ? down;
    void foo () {
        down.down = ?;
    }
}
```

## C

Upcast is illegal, syntactically. Because cast is readonly (?rly? just because of this?)
