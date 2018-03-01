package farruh.edu.jumbocs;

public class test {
    public static void main(String[] args) {
        String[] animals = removeDups(new String[]{"horse","dog","cat", "dog","cat"});

        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    static String[] removeDups(String[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; i < elements.length; j++) {
                if (elements[i] != null && elements[j] != null) {
                    if (elements[i].equalsIgnoreCase(elements[j])) {
                        elements[j] = null;
                    }
                }
            }
        }

        int counter = 0;
        String[] newElements = new String[elements.length];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                newElements[counter] = elements[i];
                counter++;
            }
        }
        return newElements;
    }

}
