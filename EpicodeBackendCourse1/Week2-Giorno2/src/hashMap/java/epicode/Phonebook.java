package hashMap.java.epicode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Phonebook {
    private Map<String, String> contacts;

    public Phonebook() {
        this.contacts = new HashMap<>();
        // Inserimento di alcuni contatti di esempio
        this.contacts.put("Mario Rossi", generateRandomPhoneNumber());
        this.contacts.put("Mario Bianchi", generateRandomPhoneNumber());
        this.contacts.put("Eugenio Antonioli", generateRandomPhoneNumber());
        this.contacts.put("Sara Verzillo", generateRandomPhoneNumber());
        this.contacts.put("Pippo Papputi", generateRandomPhoneNumber());
        this.contacts.put("Paroli Parolo", generateRandomPhoneNumber());
        this.contacts.put("Gene Gnocchi", generateRandomPhoneNumber());
    }

    public void addContact(String name, String phoneNumber) {
        this.contacts.put(name, phoneNumber);
    }

    public void deleteContact(String name) {
        this.contacts.remove(name);
    }

    public String searchByPhoneNumber(String phoneNumber) {
        for (Map.Entry<String, String> entry : this.contacts.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public String searchByName(String name) {
        return this.contacts.get(name);
    }

    public void printContacts() {
        for (Map.Entry<String, String> entry : this.contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private String generateRandomPhoneNumber() {
        Random rand = new Random();
        return String.format("%03d-%03d-%03d", rand.nextInt(1000), rand.nextInt(1000), rand.nextInt(1000));
    }
}
