# Task 4

> We have `X <: Y <: Z`

## C.1

> Compare A.1 and A.3

For A.3 basically all the types should be a subtype of `A`.

Incomparable. (????)

### Work in A.1 but not in A.3

```java
concatenate(Y, List<X>, List<Z>);
```

### Work in A.3 but not in A.1

```java
concatenate(X, List<X>, List<X>); // basically the 3rd case!
```

I mean it is being "lenient" in different sense...

## C.2 

> Compare A.2 and A.3

A.3 is more lenient than A.2 (of course).

## C.3 

> Compare A.1 and B

The same.

