public class Runner {
    public static void main(String[]args){
       /* System.out.println("**Animals**");
        Animal pet = new Animal("pet","white",3,true);
        System.out.println(pet.getName());
        System.out.println(pet.getColor());
        System.out.println(pet.getAge());
        System.out.println(pet.isVaccinated());
        pet.adopt();
        pet.feed();
        System.out.println("**Dog**");
        Dog dog = new Dog("dog","black",4,true,true,true);
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        System.out.println(dog.getAge());
        System.out.println(dog.isVaccinated());
        System.out.println(dog.hasBeenWalked());
        System.out.println(dog.isBarking());
        dog.walk();
        dog.adopt();
        dog.feed();
        dog.bark();
        System.out.println("**Cat**");
        Cat cat = new Cat("cat","orange",5,false,false,true);
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat.getAge());
        System.out.println(cat.isVaccinated());
        System.out.println(cat.hasPlayedWith());
        System.out.println(cat.isHiding());
        cat.play();
        cat.adopt();
        cat.feed();
        cat.hide();*/
        //own hierarachy
        season s = new season(9,false);
        System.out.println(s.getMonth());
        System.out.println(s.isCold());
        s.scenery();
        summer su = new summer(6,false,85);
        System.out.println(su.getMonth());
        System.out.println(su.isCold());
        System.out.println(su.getDegree());
        su.hadAC();
        winter w = new winter(12,true,true);
        System.out.println(w.getMonth());
        System.out.println(w.isCold());
        System.out.println(w.snow());
        w.hasHeater();



    }
}
