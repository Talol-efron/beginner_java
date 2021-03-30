public abstract class Basic {
    String name;
    int hp;
    int attack;
    int mp;

    public Basic(String name, int hp, int attack, int mp){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.mp = mp;
    }

    public abstract void action();

    public abstract void skill();

}
