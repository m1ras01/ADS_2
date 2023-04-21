 # __MyArrayList__
 MyArrayList is a Java class that implements a simple ArrayList. An ArrayList is a dynamic data structure that can store elements of any type and has a variable size. This implementation is generic, which means it can store elements of any type.
 The MyArrayList class provides several methods to interact with the ArrayList. These methods include adding elements, getting elements, removing elements, checking the size of the list, and more.
 To use the MyArrayList class in your Java program, simply import the class and create an instance of it:

```java
MyArrayList<String> myList = new MyArrayList<>();
```
The example above creates an ArrayList of Strings. You can replace "String" with any other type you want to store.

<br/>
<br/>

 ### ___Methods___
```java
public void add(E element) {
        if (size == arr.length) {
            E[] newArr = (E[]) new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = (E) arr[i];
            }
            arr = newArr;
        }
        arr[size++] = element;
    } 
```
Adds an element to the end of the list. If the list is full, it will automatically resize the array to accommodate the new element.

<br/>
<br/>

```java
public void add(E item, int index) {
        if (index >= size) {
            Object[] newArr = new Object[arr.length * 20];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            arr[index] = item;
        } else {
            arr[index] = item;
            size++;
        }
    }
```

Inserts the specified element at the specified position in the list. If the index is greater than or equal to the size of the list, the element is added to the end of the list.

<br/>
<br/>

```java
public E getElement(int index) {
        checkIndex(index);
        return (E) arr[index];
    }
```
Returns the element at the specified position in the list.

<br/>
<br/>

```java
public void remove(int index) {
        checkIndex(index);
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }
```

Removes the element at the specified position in the list.

<br/>
<br/>

```java
public boolean removeAndChecker(E item) {
        for (int i = 0; i <= size; i++) {
            if (Objects.equals(item, arr[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

```

Removes the first occurrence of the specified element from the list, if it is present. Returns true if the element was removed, false otherwise.

<br/>
<br/>

```java
public void clear() {
        size = 0;
        Object[] newArr = new Object[size];
        arr = newArr;
    }
```

Removes all elements from the list.

<br/>
<br/>

```java
public boolean contains(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(arr[i])) {
                    return true;
                }

            }
        }
        return false;
    }
```

Returns true if the list contains the specified element, false otherwise.

<br/>
<br/>

```java
public int indexOf(Object o) {
    if (o == null) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return i;
            }
        }
    } else {
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(o, arr[i])) {
                return i;
            }
        }

      }
    return -1;
 }
```

Returns the index of the first occurrence of the specified element in the list, or -1 if the element is not present.

<br/>
<br/>

```java
public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (Objects.equals(arr[i], o)) {
                    return i;
                }
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            if (Objects.equals(arr[i], o)) {
                return i;
            }

        }
        return -1;
    }
```

Returns the index of the last occurrence of the specified element in the list, or -1 if the element is not present.

<br/>
<br/>

```java
public void sort(){
        for(int i = 0; i < arr.length   ; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[min] != null && arr[j] != null){
                if((Integer)arr[min] > (Integer)arr[j]) {
                    min = j;
                }
                }
            }

            Object temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
```
Sorts the elements in the list in ascending order. Only works for lists containing integers.

<br/>
<br/>

```java
public int Size() {
        return size;
    }
```
Returns the number of elements in the list.

<br/>
<br/>

```java
public void checkIndex(int index) {
        if (index < 0 || index >= arr.length) throw new IndexOutOfBoundsException();
    }
```
Throws an IndexOutOfBoundsException if the specified index is out of range (index < 0 || index >= arr.length).

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>



 # __MyLinkedList__

 This is a Java implementation of a generic linked list data structure. The MyLinkedList class contains an inner Node class to represent the nodes of the linked list. Each node contains an element of type E, a reference to the next node, and a reference to the previous node.

 ```java
public class MyLinkedList<E>
```
___Constructors___
MyLinkedList() - creates an empty linked list.

<br/>

## __Methods__

<br/>

```java
add(E element)
```

Adds the specified element to the end of the list.

<br/>
<br/>

```java
get(int index)
```

Returns the element at the specified index in the list.

<br/>
<br/>

```java
remove(int index)
```

Removes the element at the specified index from the list.


<br/>
<br/>

```java
size()
```

Returns the number of elements in the list.

<br/>
<br/>

```java
clear()
```

Removes all elements from the list.

<br/>
<br/>

```java
indexOf(Object o)
```

Returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.

<br/>
<br/>

```java
lastIndexOf(Object o)
```

Returns the index of the last occurrence of the specified element in the list, or -1 if the element is not found.

<br/>
<br/>

```java
size()
```

Returns the number of elements in the list.

<br/>
<br/>

```java
size()
```

Returns the number of elements in the list.

<br/>
<br/>

```java
size()
```

Returns the number of elements in the list.

<br/>
<br/>

## __Inner class__
_Node_ -
Represents a node in the linked list.
<br/>

`element` - the element stored in the node

`next` - a reference to the next node in the list

`prev` - a reference to the previous node in the list

![](https://c.tenor.com/5GmWzNk994gAAAAC/thank-you-obama.gif)
