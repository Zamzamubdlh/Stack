package com.stack;

public class Main {

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        DataMhs zamzam_ubaidilah = new DataMhs(1, "Zamzam Ubaidilah", "21552011057");
        DataMhs rifky_abdul_hanan = new DataMhs(2, "Rifky Abdul Hanan", "21552011052");
        DataMhs bayu_alam_pamungkas = new DataMhs(3, "Bayu Alam Pamungkas", "21552011044");
        DataMhs azis_banon_sanjaya = new DataMhs(4, "Azis Banon Sanjaya", "21552011453");

        stack.push(zamzam_ubaidilah);
        stack.push(rifky_abdul_hanan);
        stack.push(bayu_alam_pamungkas);
        stack.push(azis_banon_sanjaya);

        System.out.println();
        System.out.println("Initial Data");
        stack.printStack();

        stack.pop();

        System.out.println();
        System.out.println("Data After Pop");
        stack.printStack();

        System.out.println();
        System.out.print("Stack Size = ");
        System.out.println(stack.size());
    }
}
