template <typename T> class Doubling : public T {
    public:
    virtual void setVal (int x) override {
        T::setVal(x * 2);
    }
}

// Counting: just keep the counter and return the local counter
// Ad-hoc mixins and Scala traits?
//// No subtype relation between the mixins?
//// 1. you can mixin the same thing twice here
//// 2. Order of mixins doesn't matter for Scala?
