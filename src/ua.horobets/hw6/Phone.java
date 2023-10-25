package ua.horobets.hw6;

/*
Класс Phone.
а) Создайте класс Phone, который содержит переменные(поля) number,
model и weight.
б) Добавить конструктор в класс Phone, который принимает на вход
три параметра для инициализации переменных класса - number, model
и weight.
в) Добавить конструктор, который принимает на вход два параметра
для инициализации переменных класса - number, model.
г) Добавить конструктор без параметров.
д) Создайте три экземпляра этого класса.
ж) Присвоить значения полям класса.
з) Выведите на консоль значения их полей.
и) Добавить в класс Phone методы: receiveCall, имеет один параметр
– имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
getNumber – возвращает номер телефона. Вызвать эти методы для
каждого из объектов.
 */
public class Phone {                                          //a
    public boolean number;
    public String model;
    public int weight;

    public Phone(boolean number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

   /* public Phone(boolean number, String model) {                   //в
        this.number = number;
        this.model = model;
    }

    public Phone() {                                           //г
    }  */

  /*  public static void main(String[] args) {

       Phone phoneA = new Phone(number"0635568458", model"nokia", weight"150");  //д
       Phone phoneB = new Phone(number"0635698458", model"siemens", weight"100");
       Phone phoneC = new Phone(number"0665568436", model"sony", weight"120");
    }

   /* public void Phones(boolean number, String model, int weight) {           //ж
        Phone a = new Phone();
        a.number = 0635568458;
        a.model = nokia;
        a.weight = 150;

        Phone b = new Phone();
        b.number = 0635698458;
        b.model = siemens;
        b.weight = 100;

        Phone c = new Phone();
        c.number = 0665568436;
        c.model = sony;
        c.weight = 120;
  }*/
  /*  public void getValyes(){
        String info = "number:" +"model:" +"weight" + "\n";
    }
    System.out.println(a.getValyes);
    System.out.println(b.getValyes);
    System.out.println(c.getValyes);
*/
}