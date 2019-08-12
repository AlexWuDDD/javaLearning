package v1ch08.pair1;

import v1ch08.Pair;

public class PairTest1
{
    public static void main(String[] args)
    {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minMax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        System.out.println(ArrayAlg.getMiddle("John", "Q", "Public"));
        System.out.println(ArrayAlg.getMiddle(3.14, 1729, 0));

    }
}

class ArrayAlg
{
    public static Pair<String> minMax(String[] a)
    {
        if(null == a || 0 == a.length){
            return null;
        }

        String min = a[0];
        String max = a[0];
        for(int i = 1; i < a.length; ++i){
            if(min.compareTo(a[i]) > 0) min = a[i];
            if(max.compareTo(a[i]) < 0) max = a[i];
        }

        return new Pair<>(min, max);

    }

    public static <T> T getMiddle(T... a)
    {
        return a[a.length/2];
    }
}
