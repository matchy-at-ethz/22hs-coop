public class task4 {
    class Concatenator<A> {

        // original
        public void concatenate (A separator, List<A> from, List<A> to) {
            to.add(separator);
            for (int i = 0; i < from.length(); i++) {
                to.add(from.get(i));
            }
        }
        
        // A.1
        public void concatenate1(
                A separator,
                List<? extends A> from,
                List<? super A> to
        ) {
            to.add(separator);
            for (int i = 0; i < from.length(); i++) {
                to.add(from.get(i));
            }
        }

        // A.2
        public <B extends A> void concatenate2 (
            A separator, // or B separator, it's also okay since it's still less restrictive than orignimal implementaion
            List<B> from,
            List<A> to,
        ) {
            to.add(separator);
            for (int i = 0; i < from.length(); i++) {
                to.add(from.get(i));
            }
        }

        // A.3, any number of type param
        public <S extends A, T extends S> void concatenate3 (
            S separator,
            List<T> from, // important
            List<S> to,
        ) {
            to.add(separator);
            for (int i = 0; i < from.length(); i++) {
                to.add(from.get(i));
            }
        }

        // B, using scala syntax
        public interface GetList<+A> {
            public int length();
            public A get (int i);
        }
        public interface AddList<-A> {
            public void add (A el);
        }

        public interface List<A> extends AddList<A>, GetList<A> { 
            // ...
        }

        // What about interface List2<+A, -B>?
        public void concatenate_Scala(
            A separator,
            GetList<A> from,
            AddList<A> to,
        ) {
            to.add(separator);
            for (int i = 0; i < from.length(); i++) {
                to.add(from.get(i));
            }
        }
    }
}
