#### Collections Framework
> Focus on Main Business  Logic rather than Low Level Logics

- Collection Framework” has been defined in JDK 1.2 which holds all the collection classes and interface in it.
- Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main “root” interfaces of Java collection classes.

##### What is a Framework?

A framework is a set of classes and interfaces which provide a ready-made architecture.

##### Advantages of the Collection Framework

- Reduces programming effort
- Increases program speed and quality
- Consistent API


##### List
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html

* Ordered Collection
* Control over the insertion
* List allows Duplicate

Way to Initialize
- List<String> fruites = List.of("orange","apple");

- ArrayList - Underline Array - Get element is easy, inserting, Delete is Costly.
- LinkedList - LinkedList
- Vector
- 
- ![](../../../../../../../../../../var/folders/d8/ds93y2fd3rbf5kpykg7wv05r0000gn/T/TemporaryItems/NSIRD_screencaptureui_TNSXrd/Screenshot 2022-10-25 at 4.26.24 PM.png)![](../../../../../../../../../../var/folders/d8/ds93y2fd3rbf5kpykg7wv05r0000gn/T/TemporaryItems/NSIRD_screencaptureui_uhhBAk/Screenshot 2022-10-25 at 4.27.04 PM.png)

Most of the time, programmers prefer ArrayList over Vector because ArrayList can be synchronized explicitly using Collections.synchronizedList.



#### Set

- Unique Only
- If o1.equals(o2) Only one will be in the List

Check Implementation of HashSet in Java doc
