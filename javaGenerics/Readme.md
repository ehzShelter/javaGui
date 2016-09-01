### advantages of generics code over non-generic code

  >  stronger type checks at compile time

  >  elimination of casting overhead, remember cast is not always good practice, as while casting assembly code actually generate as required

```java
    List list = new ArrayList();
    list.add("hello");
    String s = (String) list.get(0);
```

     better with generics

```java
    // ArrayList of String
    List<String> list = new ArrayList<String>()
    list.add("hello");
    // no explict type casting required
    String s = list.get(0)
```

  > Moreover, diversity ..allowing different containers for different data types

#### Generic Types

    A Simple Box Class

```java
    class Name<T1, T2, T3, ...., Tn>
    {
        // code stuff
    }
```

#### Multiple Type Parameters

```java
    // Key Value
    public interface Pair<K, V> {
        public K getKey();
        public V getValue();
    }

    public class OrderedPair<K, V> implements Pair<K, V> {
        private K key;
        private V value;

        public OrderedPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    // Instantiating a class

    Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
    Pair<String, String> p1 = new OrderedPair<String, String>("hello", "asshole");

    // you can use diamond notation
    // It can evaluate type from lvalue reference
    OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
    OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "asshole");
```
##### Parameterized Types
```java
    OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>(...));
```

