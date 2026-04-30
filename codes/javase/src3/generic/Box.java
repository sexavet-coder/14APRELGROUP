package generic;

class Box<T> {

 private T value;

 public void setValue(T value) {
     this.value = value;
 }

 public T getValue() {
     return value;
 }

 public <E> void printType(E element) {
     System.out.println("Dəyər: " + element);
     System.out.println("Tip: " + element.getClass().getSimpleName());
 }
}

