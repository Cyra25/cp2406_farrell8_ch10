public class DemoHorses {
    public static void main(String[] args){
        RaceHorse raceHorse = new RaceHorse();
        Horse horse = new Horse();
        horse.setHorseName("Browny");
        horse.setHorseColor("Brown");
        horse.setBirthYear(1999);
        raceHorse.setHorseName("Whity");
        raceHorse.setHorseColor("White");
        raceHorse.setBirthYear(2002);
        raceHorse.setRaces(5);
        System.out.println("Horse name - " + horse.getHorseName() +
                "\nColor - "+ horse.getHorseColor() +
                "\nBirth year - " + horse.getBirthYear());
        System.out.println("Horse name - " + raceHorse.getHorseName() +
                "\nColor - "+ raceHorse.getHorseColor() +
                "\nBirth year - " + raceHorse.getBirthYear()+
                "\nNumber of races - " + raceHorse.getRaces());
    }
}
