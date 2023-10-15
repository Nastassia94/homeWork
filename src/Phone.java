public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }


    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }



    public Phone() {

    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number){
        System.out.println("Звонит " + name + " " + number);
    }

    public int getNumber(){
        return this.number;
    }

}



