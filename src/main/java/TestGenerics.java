public class TestGenerics {
    public static <T extends Comparable<T>> int greaterThan(T[] array, T e) {
        int count = 0;
        for (T elem : array)
            if (elem.compareTo(e) > 0)
                ++count;
        return count;
    }
    public static void main(String args[]) {
//        Integer[] a = {5,2,17,8,14,2,4,11,12};
        Character[] a = {'a','b','c','e'};

//        System.out.println("Greater than: "+ greaterThan(a,7));
        System.out.println("Greater than: "+ greaterThan(a,'d'));
    }
}
