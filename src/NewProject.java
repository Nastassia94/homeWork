public class NewProject {
   public static void main(String[] args){


       Phone phone1;
       Phone phone2;
       Phone phone3;

       phone1 = new Phone(123, "Iphone", 111);
//       phone1.model = "Iphone";
//       phone1.number = 123;
//       phone1.weight = 111;
       System.out.println("Phone 1: " + phone1.model + ' ' + phone1.weight + ' ' + phone1.number);
       phone1.receiveCall("Лера");
       phone1.receiveCall("Lera", 123);
       System.out.println(phone1.getNumber());


       phone2 = new Phone(321, "Xiaomi", 222);
//       phone2.model = "Xiaomi";
//       phone2.number = 321;
//       phone2.weight = 222;
       System.out.println("Phone 2: " + phone2.model + ' ' + phone2.weight + ' ' + phone2.number);
       phone2.receiveCall("Оля");
       phone2.receiveCall("Olya", 321);
       System.out.println(phone2.getNumber());

       phone3 = new Phone(212, "Xiaomi", 333);
//       phone3.model = "Samsung";
//       phone3.number = 213;
//       phone3.weight = 333;
       System.out.println("Phone 3: " + phone3.model + ' ' + phone3.weight + ' ' + phone3.number);
       phone3.receiveCall("Маша");
       phone3.receiveCall("Masha", 312);
       System.out.println(phone3.getNumber());






       Utils.check(0,0,2);

       Utils.checkDayAndMonthIsHoliday(0, 5);
   }
}


