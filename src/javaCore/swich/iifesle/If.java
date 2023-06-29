package javaCore.swich.iifesle;

public class If {
    public static void main(String[] args) {
        var mounth = 4;
        if (mounth==12||mounth==1||mounth==2){
            System.out.println("Winter");
        }
       else if (3<=mounth&&mounth<=5){
            System.out.println("Spring");
        }
       else if (mounth==6||mounth==7||mounth==8){
            System.out.println("Summer");
        }
      else   if (mounth==9||mounth==10||mounth==11){
            System.out.println("Autumn");
        }
    }
}
