public class Animals {
    private String eat;


    public Animals(String eat) {
        this.eat = eat;
    }
    public String getEat() {
        return eat;
    }
    public void setEat(String eat) {
        this.eat = eat;
    }
    static String best(){
      return "Жейт...";

    }

    @Override
    public String toString() {
        return "Animals{" +best()+
                "eat='" + eat + '\'' +
                '}';
    }
}
