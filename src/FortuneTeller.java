import java.util.ArrayList;

public class FortuneTeller {
    public ArrayList<String> fortunes;

    public FortuneTeller(ArrayList<String> fortunes) {
        this.fortunes = fortunes;
    }

    public FortuneTeller() {
        this.fortunes = new ArrayList<>();
        this.fortunes.add("test");
        this.fortunes.add("test1");
        this.fortunes.add("test2");
        this.fortunes.add("test3");
    }

    public String getRandomFortune(){
        int random = (int)Math.floor(Math.random() * fortunes.size());
        return fortunes.get(random);
    }

}
