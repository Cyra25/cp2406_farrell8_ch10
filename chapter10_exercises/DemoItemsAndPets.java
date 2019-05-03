public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold itemSold = new ItemSold();
        PetSold petSold = new PetSold();
        itemSold.setPrice(3);
        itemSold.setDescription("This is dogA");
        itemSold.setInvoiceNum(123456);
        System.out.println(itemSold.getDescription() + "\nPrice is " + itemSold.getPrice() +
                "\nInvoice number is " + itemSold.getInvoiceNum());

        ItemSold itemSold1 = new ItemSold();
        itemSold1.setPrice(7);
        itemSold1.setDescription("This is dogB");
        itemSold1.setInvoiceNum(654321);
        System.out.println(itemSold1.getDescription() + "\nPrice is " + itemSold1.getPrice() +
                "\nInvoice number is " + itemSold1.getInvoiceNum());

        PetSold petSold1 = new PetSold();
        petSold.setVaccinated(true);
        petSold.setNeutered(true);
        petSold.setHousebroken(true);
        petSold1.setVaccinated(false);
        petSold1.setNeutered(false);
        petSold1.setHousebroken(false);
        System.out.println("vaccinated " + petSold.getVaccinated() + "\nneutered " + petSold.getNeutered()+
                "\nhousebroken "+ petSold.getHousebroken());
        System.out.println("vaccinated " + petSold1.getVaccinated() + "\nneutered " + petSold1.getNeutered()+
                "\nhousebroken "+ petSold1.getHousebroken());

    }
}
