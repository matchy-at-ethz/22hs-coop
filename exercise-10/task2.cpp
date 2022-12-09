#include <cstddef>
#include <iostream>

class Person {
    int money;
    Person *spouse;
public:
    Person(int m, Person *s) {
        if (!s) { spouse = NULL; }
        else { spouse = s; s->spouse = this; }
        money = m;
    
    }
    
    /* Just for showcasing we can modify the money */
    int getMoney() { return money; }

    void f() const {
        if (spouse) {
            spouse->spouse->money = 114514; // spouse is not a const ptr
        }
    }
};

int main() {
    Person *p = new Person(0, 0);
    Person *p2 = new Person(0, p);
    std::cout << p2->getMoney() << std::endl;
    p2->f();
    std::cout << p2->getMoney() << std::endl;
}

