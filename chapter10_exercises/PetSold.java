public class PetSold extends ItemSold {
    public boolean vaccinated, neutered, housebroken;

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public void setHousebroken(boolean housebroken) {
        this.housebroken = housebroken;
    }
    public boolean getVaccinated(){
        return vaccinated;
    }
    public boolean getNeutered(){
        return neutered;
    }
    public boolean getHousebroken(){
        return housebroken;
    }

}
