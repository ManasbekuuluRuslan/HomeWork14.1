public class Lion extends Animals{
    private String sleep;
    private String run;


    public Lion(String eat, String sleep, String run){
        super(eat);
        this.sleep = sleep;
        this.run = run;
    }
    public String getSleep() {
        return sleep;
    }
    public void setSleep(String sleep) {
        this.sleep = sleep;
    }
    public String getRun() {
        return run;
    }
    public void setRun(String run) {
        this.run = run;
    }
    public String night(){
        return "Арстан уктайт... ";
  }
  public String go(){
     return "Чуркап кийик кармап жейт... ";
  }

    @Override
    public String toString() {
        return "Lion {Go desem " + go()+ "Sleep desem "+night()+
                "sleep ='" + sleep +
                ", run = " + run+
                '}';
    }
}
