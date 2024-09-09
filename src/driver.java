public class driver {
    public static void main(String[] args) {
        Collections<Object> userInput = new Collections<>();

        System.out.println("Initial collection is empty: " + userInput.isEmpty());
        userInput.makeEmpty();
        userInput.insert(5);
        userInput.insert("Hello my name is Miles Padot");
        userInput.insert(100000000);

        System.out.println("Is the number 5 in the list?: " + userInput.isPresent(5));

        userInput.remove("Hello my name is Miles Padot");

        System.out.print("Is the string about miles padot in the list?: " + userInput.isPresent("Hello my name is Miles Padot"));
    }
}
