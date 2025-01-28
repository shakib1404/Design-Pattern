private void Grow() {
    Object[] newElements = new Object[elements.length + 10];

    for (int i = 0; i < size; i++) {
        newElements[i] = elements[i];
    }

    elements = newElements;
}

private void Grow() {
    Object[] newElements = new Object[elements.length + INITIAL_CAPACITY];
    
    // More efficient copying
    System.arraycopy(elements, 0, newElements, 0, size);
    
    elements = newElements;
}
String foundPerson(String[] people) {
    for (int i = 0; i < people.length; i++) {
        if (people[i].equals("Don")) {
            return "Don";
        }
        if (people[i].equals("John")) {
            return "John";
        }
        if (people[i].equals("Kent")) {
            return "Kent";
        }
    }
    return "";
}


String foundPerson(String[] people) {
    List<String> candidates = Arrays.asList("Don", "John", "Kent");

    for (String person : people) {
        if (candidates.contains(person)) {
            return person;
        }
    }

    return "";
}
