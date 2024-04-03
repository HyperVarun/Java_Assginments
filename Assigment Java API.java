/*
 * Question 1: Program to display current date and time in java
 * Answer 1: import java.time.LocalDate;
 * import java.time.LocalDateTime;
 * 
 * class Program22 {
 * public static void main(String args[]) {
 * LocalDateTime dt = LocalDateTime.now();
 * System.out.println(dt);
 * }
 * }
 * 
 * Question 2: Write a program to convert date to a string in the format
 * "MM/DD/YYYY"
 * Answer 2:import java.text.SimpleDateFormat;
 * import java.text.DateFormat;
 * import java.time.LocalDate;
 * import java.util.Calendar;
 * 
 * public class Program23 {
 * public static void main(String[] args) {
 * 
 * 
 * // * Date dt = Calendar.getInstance();
 * // * DateFormat Formatter = new SimpleDateFormat("MM/DD/YYY");
 * // * String str = Formatter.format(dt);
 * // * System.out.println(str);
 * 
 * Date date = new Date();
 * SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
 * String strDate = formatter.format(date);
 * System.out.println("Date Format with MM/dd/yyyy : " + strDate);
 * }
 * 
 * }
 * 
 * 
 * Question 3: What is the difference between collections and Streams? Explain
 * an example
 * Answer 3: Collections
 * Mutability: Collections can be mutable or immutable. For instance, you can
 * add, update, and remove elements from mutable collections like List and Map.
 * Eager Evaluation: Operations on collections are typically performed eagerly,
 * meaning they execute immediately when called.
 * Memory Consumption: Collections can consume more memory, especially when
 * elements are added or removed frequently.
 * Parallelism: Collections generally lack built-in parallelism support for
 * operations.
 * Use Cases: Collections are suitable for tasks that involve storage,
 * modification, and traditional iteration over elements.
 * Example : Collection
 * import java.util.HashMap;
 * import java.util.Map;
 * public class CollectionsMapExample {
 * public static void main(String[] args) {
 * Map<Integer, String> studentNames = new HashMap<>();
 * studentNames.put(1, "Alice");
 * studentNames.put(2, "Bob");
 * studentNames.put(3, "Charlie");
 * System.out.println("Using a collection (Map):");
 * for (Map.Entry<Integer, String> entry : studentNames.entrySet()) {
 * System.out.println("Student ID: " + entry.getKey() + ", Name: " +
 * entry.getValue());
 * }
 * }
 * }
 * Streams :
 * Immutability: Streams are designed to be immutable; they don't modify the
 * underlying source data.
 * Lazy Evaluation: Stream operations are evaluated on demand and are inherently
 * lazy. This can lead to optimized performance by avoiding unnecessary
 * computations.
 * Memory Efficiency: Streams are generally memory-efficient due to their
 * immutability and the ability to process elements on-the-fly.
 * Parallelism: Streams come with built-in parallelism support, allowing
 * operations to be executed concurrently on multiple cores.
 * Use Cases: Streams are suitable for data transformation, filtering, sorting,
 * and parallel processing.
 * Example : Streams
 * import java.util.Arrays;
 * import java.util.List;
 * import java.util.stream.Collectors;
 * import java.util.stream.Stream;
 * public class StreamsExample {
 * public static void main(String[] args) {
 * List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
 * System.out.println("Using streams to filter and print:");
 * List<String> filteredNames = names.stream()
 * .filter(name -> name.length() > 4)
 * .collect(Collectors.toList());
 * filteredNames.forEach(System.out::println);
 * }
 * }
 * 
 * Question 4: What is Enum in java?Explain with an example
 * Answer 4: Java Enums can be thought of as classes which have a fixed set of
 * constants (a variable that does not change). The Java enum constants are
 * static and final implicitly. It is available since JDK 1.5.Enums are used to
 * create our own data type like classes. The enum data type (also known as
 * Enumerated Data Type) is used to define an enum in Java. Unlike C/C++, enum
 * in Java is more powerful. Here, we can define an enum either inside the class
 * or outside the class.
 * Java Enum internally inherits the Enum class, so it cannot inherit any other
 * class, but it can implement many interfaces. We can have fields,
 * constructors, methods, and main methods in Java enum.
 * Points to remember for Java Enum
 * Enum improves type safety
 * Enum can be easily used in switch
 * Enum can be traversed
 * Enum can have fields, constructors and methods
 * Enum may implement many interfaces but cannot extend any class because it
 * internally extends Enum class
 * Example:
 * class EnumExample1{
 * //defining the enum inside the class
 * public enum Season { WINTER, SPRING, SUMMER, FALL }
 * //main method
 * public static void main(String[] args) {
 * //traversing the enum
 * for (Season s : Season.values())
 * System.out.println(s);
 * }}
 * 
 * Question 5: What are in built Annotations in java?
 * Answer 5:Java Annotation is a tag that represents the metadata i.e. attached
 * with class, interface, methods or fields to indicate some additional
 * information which can be used by java compiler and JVM.
 * Annotations in Java are used to provide additional information, so it is an
 * alternative option for XML and Java marker interfaces.
 * Built-In Java Annotations
 * There are several built-in annotations in Java. Some annotations are applied
 * to Java code and some to other annotations.
 * Built-In Java Annotations used in Java code
 * 
 * @Override
 * 
 * @SuppressWarnings
 * 
 * @Deprecated
 * Built-In Java Annotations used in other annotations
 * 
 * @Target
 * 
 * @Retention
 * 
 * @Inherited
 * 
 * @Documented
 */