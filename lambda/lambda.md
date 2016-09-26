#### few lambda expression

```java

    // so close to JS lambda
    Runnable noArguments = () -> System.out.println("Hello Lambda");
    ActionListener oneArgument = event -> System.out.println("button clicked");

    // multiline statement ..curlybraces needed
    Runnable multiStatement = () -> {
        System.out.print("Hello");
        System.out.print("World");
    }

    BinaryOperator<Long> add = (x, y) -> x + y;
    // explicitly

    BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;

```
