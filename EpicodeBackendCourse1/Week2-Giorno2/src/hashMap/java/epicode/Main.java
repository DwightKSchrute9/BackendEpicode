package hashMap.java.epicode;


public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.addContact("Luca Rossi", "123-456-789");
        System.out.println("Contatto aggiunto: Luca Rossi");

        System.out.println("Numero di telefono di Mario Rossi: " + phonebook.searchByName("Mario Rossi"));

        System.out.println("Nome associato al numero 123-456-789: " + phonebook.searchByPhoneNumber("123-456-789"));

        phonebook.deleteContact("Luca Rossi");
        System.out.println("Contatto cancellato: Luca Rossi");

        System.out.println("Lista dei contatti:");
        phonebook.printContacts();
    }
}
