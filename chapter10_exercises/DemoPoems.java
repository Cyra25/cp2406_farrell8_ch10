public class DemoPoems {
    public static void main(String[] args) {
        Poem poem = new Poem("One", 1);
        Couplet couplet = new Couplet("Couplet");
        Limerick limerick = new Limerick("Limerick");
        Haiku haiku = new Haiku("Haiku");
        System.out.println(poem.getName()+"\n"+ poem.getNumOfLines());
        System.out.println(couplet.getName()+"\n"+couplet.getNumOfLines());
        System.out.println(limerick.getName()+"\n"+limerick.getNumOfLines());
        System.out.println(haiku.getName()+"\n"+haiku.getNumOfLines());
    }
}
