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
