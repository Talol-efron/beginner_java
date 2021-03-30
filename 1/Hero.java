public class Hero extends Basic {
    public Hero(String name, int hp, int attack, int mp){
        super(name, hp, attack, mp);
    }

    @Override
    public void action(){
        System.out.println(this.name +"は連続アタックを繰り出した！");
        
    }

    @Override
    public void skill(){

    }
}
