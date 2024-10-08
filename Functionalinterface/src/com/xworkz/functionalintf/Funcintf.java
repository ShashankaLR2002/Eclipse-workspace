package com.xworkz.functionalintf;
import java.util.function.*;

public class Funcintf {

    public static void main(String[] args) {
        // 1. 
        BiConsumer<String, Integer> biConsumer = (s, i) -> System.out.println("BiConsumer Output: " + s + " " + i);
        biConsumer.accept("Prime Minister", 1);

        // 2. 
        BiFunction<String, Integer, String> biFunction = (s, i) -> "BiFunction Output: " + s + " " + i;
        System.out.println(biFunction.apply("Year", 2024));

        // 3.
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println("BinaryOperator Output: " + binaryOperator.apply(5, 10));

        // 4. 
        BiPredicate<String, Integer> biPredicate = (s, i) -> s.length() > i;
        System.out.println("BiPredicate Output: " + biPredicate.test("Hello", 3));

        // 5.
        BooleanSupplier booleanSupplier = () -> true;
        System.out.println("BooleanSupplier Output: " + booleanSupplier.getAsBoolean());

        // 6. 
        Consumer<String> consumer = s -> System.out.println("Consumer Output: " + s);
        consumer.accept("This is a Consumer");

        // 7. 
        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a + b;
        System.out.println("DoubleBinaryOperator Output: " + doubleBinaryOperator.applyAsDouble(5.5, 4.5));

        // 8. 
        DoubleConsumer doubleConsumer = d -> System.out.println("DoubleConsumer Output: " + d);
        doubleConsumer.accept(3.14);

        // 9. 
        DoubleFunction<String> doubleFunction = d -> "DoubleFunction Output: Value: " + d;
        System.out.println(doubleFunction.apply(7.89));

        // 10. 
        DoublePredicate doublePredicate = d -> d > 0.0;
        System.out.println("DoublePredicate Output: " + doublePredicate.test(-1.0));

        // 11. DoubleSupplier
        DoubleSupplier doubleSupplier = () -> 3.14;
        System.out.println("DoubleSupplier Output: " + doubleSupplier.getAsDouble());

        // 12. DoubleToIntFunction
        DoubleToIntFunction doubleToIntFunction = d -> (int) d;
        System.out.println("DoubleToIntFunction Output: " + doubleToIntFunction.applyAsInt(4.99));

        // 13. DoubleToLongFunction
        DoubleToLongFunction doubleToLongFunction = d -> (long) d;
        System.out.println("DoubleToLongFunction Output: " + doubleToLongFunction.applyAsLong(5.67));

        // 14. DoubleUnaryOperator
        DoubleUnaryOperator doubleUnaryOperator = d -> d * 2;
        System.out.println("DoubleUnaryOperator Output: " + doubleUnaryOperator.applyAsDouble(4.0));

        // 15. Function<T, R>
        Function<String, Integer> function = s -> s.length();
        System.out.println("Function Output: " + function.apply("Hello"));

        // 16. IntBinaryOperator
        IntBinaryOperator intBinaryOperator = (a, b) -> a + b;
        System.out.println("IntBinaryOperator Output: " + intBinaryOperator.applyAsInt(3, 4));

        // 17. IntConsumer
        IntConsumer intConsumer = i -> System.out.println("IntConsumer Output: " + i);
        intConsumer.accept(10);

        // 18. IntFunction<R>
        IntFunction<String> intFunction = i -> "IntFunction Output: Value: " + i;
        System.out.println(intFunction.apply(20));

        // 19. IntPredicate
        IntPredicate intPredicate = i -> i > 0;
        System.out.println("IntPredicate Output: " + intPredicate.test(-5));

        // 20. IntSupplier
        IntSupplier intSupplier = () -> 42;
        System.out.println("IntSupplier Output: " + intSupplier.getAsInt());

        // 21. IntToDoubleFunction
        IntToDoubleFunction intToDoubleFunction = i -> (double) i;
        System.out.println("IntToDoubleFunction Output: " + intToDoubleFunction.applyAsDouble(25));

        // 22. IntToLongFunction
        IntToLongFunction intToLongFunction = i -> (long) i;
        System.out.println("IntToLongFunction Output: " + intToLongFunction.applyAsLong(30));

        // 23. IntUnaryOperator
        IntUnaryOperator intUnaryOperator = i -> i * 2;
        System.out.println("IntUnaryOperator Output: " + intUnaryOperator.applyAsInt(15));

        // 24. LongBinaryOperator
        LongBinaryOperator longBinaryOperator = (a, b) -> a + b;
        System.out.println("LongBinaryOperator Output: " + longBinaryOperator.applyAsLong(100L, 200L));

        // 25. LongConsumer
        LongConsumer longConsumer = l -> System.out.println("LongConsumer Output: " + l);
        longConsumer.accept(123456789L);

        // 26. LongFunction<R>
        LongFunction<String> longFunction = l -> "LongFunction Output: Value: " + l;
        System.out.println(longFunction.apply(9876543210L));

        // 27. LongPredicate
        LongPredicate longPredicate = l -> l > 0;
        System.out.println("LongPredicate Output: " + longPredicate.test(-123L));

        // 28. LongSupplier
        LongSupplier longSupplier = () -> 123456789L;
        System.out.println("LongSupplier Output: " + longSupplier.getAsLong());

        // 29. LongToDoubleFunction
        LongToDoubleFunction longToDoubleFunction = l -> (double) l;
        System.out.println("LongToDoubleFunction Output: " + longToDoubleFunction.applyAsDouble(456L));

        // 30. LongToIntFunction
        LongToIntFunction longToIntFunction = l -> (int) l;
        System.out.println("LongToIntFunction Output: " + longToIntFunction.applyAsInt(789L));

        // 31. LongUnaryOperator
        LongUnaryOperator longUnaryOperator = l -> l * 2;
        System.out.println("LongUnaryOperator Output: " + longUnaryOperator.applyAsLong(1000L));

        // 32. ObjDoubleConsumer<T>
        ObjDoubleConsumer<String> objDoubleConsumer = (s, d) -> System.out.println("ObjDoubleConsumer Output: " + s + " " + d);
        objDoubleConsumer.accept("Value:", 3.14);

        // 33. ObjIntConsumer<T>
        ObjIntConsumer<String> objIntConsumer = (s, i) -> System.out.println("ObjIntConsumer Output: " + s + " " + i);
        objIntConsumer.accept("Integer Value:", 10);

        // 34. ObjLongConsumer<T>
        ObjLongConsumer<String> objLongConsumer = (s, l) -> System.out.println("ObjLongConsumer Output: " + s + " " + l);
        objLongConsumer.accept("Long Value:", 1000L);

        // 35. Predicate<T>
        Predicate<String> predicate = s -> s.length() > 5;
        System.out.println("Predicate Output: " + predicate.test("HelloWorld"));

        // 36. Supplier<T>
        Supplier<String> supplier = () -> "Hello, World!";
        System.out.println("Supplier Output: " + supplier.get());

        // 37. ToDoubleBiFunction<T, U>
        ToDoubleBiFunction<String, Integer> toDoubleBiFunction = (s, i) -> s.length() + i;
        System.out.println("ToDoubleBiFunction Output: " + toDoubleBiFunction.applyAsDouble("Hello", 5));

        // 38. ToDoubleFunction<T>
        ToDoubleFunction<String> toDoubleFunction = s -> (double) s.length();
        System.out.println("ToDoubleFunction Output: " + toDoubleFunction.applyAsDouble("Hello"));

        // 39. ToIntBiFunction<T, U>
        ToIntBiFunction<String, Integer> toIntBiFunction = (s, i) -> s.length() + i;
        System.out.println("ToIntBiFunction Output: " + toIntBiFunction.applyAsInt("Hello", 5));

        // 40. ToIntFunction<T>
        ToIntFunction<String> toIntFunction = s -> s.length();
        System.out.println("ToIntFunction Output: " + toIntFunction.applyAsInt("Hello"));

        // 41. ToLongBiFunction<T, U>
        ToLongBiFunction<String, Integer> toLongBiFunction = (s, i) -> s.length() + i;
        System.out.println("ToLongBiFunction Output: " + toLongBiFunction.applyAsLong("Hello", 5));

        // 42. ToLongFunction<T>
        ToLongFunction<String> toLongFunction = s -> (long) s.length();
        System.out.println("ToLongFunction Output: " + toLongFunction.applyAsLong("Hello"));

        // 43. 
        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        System.out.println("UnaryOperator Output: " + unaryOperator.apply("hello"));
    }
}
