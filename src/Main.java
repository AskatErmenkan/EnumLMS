//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        ToDo TransportType деген enum туз. Ичине ар кандай типтеги унааларды жаз. Мисалы: CAR, BUS, TRUCK.
//         Enum-дын ичинде бир  метод болсун:
//         public  double calculateTravelCost(double distance);
//         Бул метод транспорттун ар бир түрү үчүн өзүнүн жол баасын эсептеп чыгышы керек.
//         (CAR)  Автоунаанын бир километринин баасы $0,1.
//         (BUS)  Автобустун бир километринин баасы $0,05
//         (TRUCK.) Трак үчүн бир километрдин баасы $0,02

    double distance = 10.0;
    double carCost = TransportType.CAR.calculateTravelCost(distance);
    double busCost = TransportType.BUS.calculateTravelCost(distance);
    double TrainCost = TransportType.TRAIN.calculateTravelCost(distance);

        System.out.println("Женил автоунаа учун жол кире: " + carCost + " сом");
        System.out.println("Автобус учун жол кире: " + busCost + " сом");
        System.out.println("Поезд учун жол кире: " + TrainCost + " сом");
    }
}