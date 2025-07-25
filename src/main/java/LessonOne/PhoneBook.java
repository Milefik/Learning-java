package LessonOne;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneMap = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        List<String> phones = phoneMap.get(lastName);
        if (phones == null) {
            phones = new ArrayList<>();
            phoneMap.put(lastName, phones);
        }
        phones.add(phoneNumber);
    }

    public List<String> get(String lastName) {
        List<String> result = phoneMap.get(lastName);
        if (result == null) {
            return new ArrayList<>();
        }
        return result;
    }
}
