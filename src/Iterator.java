import java.util.LinkedList;
public class Iterator<E> implements Iterable<E>{

    Iterator () {;}

    //проверяет, имеется ли в коллекции следующее значение
    @Override
    public boolean hasNext() {
        if (this.next() != null) {
            return true;
        } else {
            return false;
        }
    }

    //возвращает следующее значение
    @Override
    public E next() {
        return this.next();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>;
    }
    
}
