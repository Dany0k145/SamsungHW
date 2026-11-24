public class Main {
    public static void main(String[] args) {
        FireArm pistol = new FireArm();
        pistol.damage = 30;
        pistol.name = "very cool pistol";
        pistol.auto = false;
        pistol.magCapacity = 7;

        FireArm smg = new FireArm();
        smg.damage = 15;
        smg.name = "simple smg";
        smg.auto = true;
        pistol.magCapacity = 30;

        FireArm sniper = new FireArm();
        sniper.damage = 75;
        sniper.name = "big sniper rifle";
        sniper.auto = false;
        pistol.magCapacity = 5;
    }
}
