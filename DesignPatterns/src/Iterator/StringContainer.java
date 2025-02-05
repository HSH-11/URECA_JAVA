package Iterator;

public class StringContainer<T> implements Container<T>{
    //String[] strArray = {"Hello", "Iterator", "Pattern"};
    private T[] items;
    
    public StringContainer(T[] items) {
        this.items = items;
    }
    @Override
    public Iterator<T> getIterator() {
        return new StringIterator();
    }
    
    // 클래스 내부에 private Iterator 구현 클래스 정의
//    private class StringIterator implements Iterator{
//        int index; // default 0 // strArray 에서 현재 들여다 보는 객체
//        
//        @Override
//        public boolean hasNext() {
//            if( index < strArray.length ) return true;
//            return false;
//        }
//        @Override
//        public Object next() {
//            // hasNext() 를 호출하지 않은 겨우 대비 if() 추가
//            if( this.hasNext() ) return strArray[index++];
//            return null;
//        }
//        
//    }
    private class StringIterator implements Iterator<T> {
        int index = 0; 

        @Override
        public boolean hasNext() {
            return index < items.length;
        }

        @Override
        public T next() {
            if (this.hasNext()) return items[index++];
            return null;
        }
    }
}
