# Task 5

## A

```java
readwrite T[] <: readonly T[]
```

## B

### Semantics

1. When we access `y[1].f`, we first go through the `y`, and then go to element `y[1]`
2. We skip `y`, `y[1]` is a direct access to `y[1]` itself

### B.1

> Do all 4 combinations of modifiers express something different from one another?

### B.2 -- first semantic

For the first semantic:

```text
* <: readonly readonly
readonly readwrite = readonly readonly
```

But `readwrite readwrite` is not a subtype of `readwrite readonly`.

Consider an example:

```java
class P { String n; }
class C {
    void client (readonly P p) {
        readwrite readwrite P[] w = new P[1];
        readwrite readonly P[] r = w;
    }

    r[0] = p // legal since r[9] and p are readonly
    w[0].n  = "..."; // legal since w[0] is readwrite
}
```

### B.2 second semantic (direct access)

```text
* <: readonly readonly
readwrite readwrite <: readonly readwrite
```

Also now `readonly readwrite` is different from `readonly readonly`.

<!-- |       | rw, rw  | rw, ro | ro,rw  | ro,ro  |
| ----- | ------ | ------ | ------ | ------ |
| rw,rw | rw, rw |        |        |        |
| rw,ro |        | rw, ro |        |        |
| ro,rw |        |        | ro, rw |      |
| ro,ro |        |        |        | ro, ro | -->

## C

> Which on seems to be the best choice?

open question
