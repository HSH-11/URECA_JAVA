package Iterator;

//StringContainer에 적용된 iterator에 String만이 아닌 다른 타입도 적용하도록 generic적용
public class Test {

	public static void main(String[] args) {
//		StringContainer container = new StringContainer();
//
//		Iterator itr = container.getIterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		String[] words = {"Hello", "Iterator", "Pattern"};
        StringContainer<String> stringContainer = new StringContainer<>(words);

        Iterator<String> itr = stringContainer.getIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Integer[] numbers = {1, 2, 3, 4, 5};
        StringContainer<Integer> intContainer = new StringContainer<>(numbers);
        //TTypeContainer<Integer> intContainer = new TTypeContainer<>(new numbers[] {1, 2, 3, 4, 5});
        Iterator<Integer> intItr = intContainer.getIterator();
        while (intItr.hasNext()) {
            System.out.println(intItr.next());
        }

	}

}
