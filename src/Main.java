import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write month : ");
            String choice = scanner.nextLine();
            System.out.println("Choose case  ");
            String choise = scanner.nextLine();
            switch (choise) {
                case "A":
                    System.out.println("Choose month  ");
                    String a = scanner.nextLine();
                    switch (a) {
                        case "1":
                            System.out.println(choice.equalsIgnoreCase("Січень"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ЗИМА.equals(Місяці.ГРУДЕНЬ.getСезон()) || Сезони.ЗИМА.equals(Місяці.СІЧЕНЬ.getСезон())|| Сезони.ЗИМА.equals(Місяці.ЛЮТИЙ.getСезон()) ) {
                                System.out.println(Місяці.ГРУДЕНЬ );
                                System.out.println(Місяці.ГРУДЕНЬ.getСезон());
                                System.out.println(Місяці.СІЧЕНЬ);
                                System.out.println(Місяці.СІЧЕНЬ.getСезон());
                                System.out.println(Місяці.ЛЮТИЙ);
                                System.out.println(Місяці.ЛЮТИЙ.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println("Day in month-------------------------");
                            if(Місяці.СІЧЕНЬ.getДні() == 31 || Місяці.БEPEЗЕНЬ.getДні() == 31 ||Місяці.ТРАВЕНЬ.getДні() == 31 || Місяці.ЛИПЕНЬ.getДні() == 31 || Місяці.СЕРПЕНЬ.getДні() == 31 || Місяці.ГРУДЕНЬ.getДні() == 31 ||Місяці.ЖОВТЕНЬ.getДні() == 31  ) {
                                System.out.println(Місяці.СІЧЕНЬ);
                                System.out.println(Місяці.СІЧЕНЬ.getДні());
                                System.out.println(Місяці.БEPEЗЕНЬ);
                                System.out.println(Місяці.БEPEЗЕНЬ.getДні());
                                System.out.println(Місяці.ТРАВЕНЬ);
                                System.out.println(Місяці.ТРАВЕНЬ.getДні());
                                System.out.println(Місяці.ЛИПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ.getДні());
                                System.out.println(Місяці.ЖОВТЕНЬ);
                                System.out.println(Місяці.ЖОВТЕНЬ.getДні());
                                System.out.println(Місяці.ГРУДЕНЬ);
                                System.out.println(Місяці.ГРУДЕНЬ.getДні());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ЗИМА.getEngVersion());
                            break;
                        case "2":
                            System.out.println(choice.equalsIgnoreCase("ЛЮТИЙ"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ЗИМА.equals(Місяці.ГРУДЕНЬ.getСезон()) || Сезони.ЗИМА.equals(Місяці.СІЧЕНЬ.getСезон())|| Сезони.ЗИМА.equals(Місяці.ЛЮТИЙ.getСезон()) ) {
                                System.out.println(Місяці.ГРУДЕНЬ );
                                System.out.println(Місяці.ГРУДЕНЬ.getСезон());
                                System.out.println(Місяці.СІЧЕНЬ);
                                System.out.println(Місяці.СІЧЕНЬ.getСезон());
                                System.out.println(Місяці.ЛЮТИЙ);
                                System.out.println(Місяці.ЛЮТИЙ.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            if(Місяці.ЛЮТИЙ.getДні() == 28 ) {
                                System.out.println(Місяці.ЛЮТИЙ);
                                System.out.println(Місяці.ЛЮТИЙ.getДні());
                                break;
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ЗИМА.getEngVersion());
                            break;
                        case "3":
                            System.out.println(choice.equalsIgnoreCase("БEPEЗЕНЬ"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ВЕСНА.equals(Місяці.БEPEЗЕНЬ.getСезон()) || Сезони.ВЕСНА.equals(Місяці.КВІТЕНЬ.getСезон())|| Сезони.ВЕСНА.equals(Місяці.ТРАВЕНЬ.getСезон()) ) {
                                System.out.println(Місяці.БEPEЗЕНЬ);
                                System.out.println(Місяці.БEPEЗЕНЬ.getСезон());
                                System.out.println(Місяці.КВІТЕНЬ);
                                System.out.println(Місяці.КВІТЕНЬ.getСезон());
                                System.out.println(Місяці.ТРАВЕНЬ);
                                System.out.println(Місяці.ТРАВЕНЬ.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println("Day in month-------------------------");
                            if(Місяці.СІЧЕНЬ.getДні() == 31 || Місяці.БEPEЗЕНЬ.getДні() == 31 ||Місяці.ТРАВЕНЬ.getДні() == 31 || Місяці.ЛИПЕНЬ.getДні() == 31 || Місяці.СЕРПЕНЬ.getДні() == 31 || Місяці.ГРУДЕНЬ.getДні() == 31 ||Місяці.ЖОВТЕНЬ.getДні() == 31  ) {
                                System.out.println(Місяці.СІЧЕНЬ);
                                System.out.println(Місяці.СІЧЕНЬ.getДні());
                                System.out.println(Місяці.БEPEЗЕНЬ);
                                System.out.println(Місяці.БEPEЗЕНЬ.getДні());
                                System.out.println(Місяці.ТРАВЕНЬ);
                                System.out.println(Місяці.ТРАВЕНЬ.getДні());
                                System.out.println(Місяці.ЛИПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ.getДні());
                                System.out.println(Місяці.ЖОВТЕНЬ);
                                System.out.println(Місяці.ЖОВТЕНЬ.getДні());
                                System.out.println(Місяці.ГРУДЕНЬ);
                                System.out.println(Місяці.ГРУДЕНЬ.getДні());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ВЕСНА.getEngVersion());
                            break;
                        case "4":
                            System.out.println(choice.equalsIgnoreCase("КВІТЕНЬ"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ВЕСНА.equals(Місяці.БEPEЗЕНЬ.getСезон()) || Сезони.ВЕСНА.equals(Місяці.КВІТЕНЬ.getСезон())|| Сезони.ВЕСНА.equals(Місяці.ТРАВЕНЬ.getСезон()) ) {
                                System.out.println(Місяці.БEPEЗЕНЬ);
                                System.out.println(Місяці.БEPEЗЕНЬ.getСезон());
                                System.out.println(Місяці.КВІТЕНЬ);
                                System.out.println(Місяці.КВІТЕНЬ.getСезон());
                                System.out.println(Місяці.ТРАВЕНЬ);
                                System.out.println(Місяці.ТРАВЕНЬ.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println("Day in month-------------------------");
                            if(Місяці.КВІТЕНЬ.getДні() == 30 || Місяці.ЧЕРВЕНЬ.getДні() == 30 ||Місяці.ВЕРЕСЕНЬ.getДні() == 30 || Місяці.ЛИСТОПАД.getДні() == 30 ) {
                                System.out.println(Місяці.КВІТЕНЬ);
                                System.out.println(Місяці.КВІТЕНЬ.getДні());
                                System.out.println(Місяці.ЧЕРВЕНЬ);
                                System.out.println(Місяці.ЧЕРВЕНЬ.getДні());
                                System.out.println(Місяці.ВЕРЕСЕНЬ);
                                System.out.println(Місяці.ВЕРЕСЕНЬ.getДні());
                                System.out.println(Місяці.ЛИСТОПАД);
                                System.out.println(Місяці.ЛИСТОПАД.getДні());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ВЕСНА.getEngVersion());
                            break;
                        case "5":
                            System.out.println(choice.equalsIgnoreCase("ТРАВЕНЬ"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ВЕСНА.equals(Місяці.БEPEЗЕНЬ.getСезон()) || Сезони.ВЕСНА.equals(Місяці.КВІТЕНЬ.getСезон())|| Сезони.ВЕСНА.equals(Місяці.ТРАВЕНЬ.getСезон()) ) {
                                System.out.println(Місяці.БEPEЗЕНЬ);
                                System.out.println(Місяці.БEPEЗЕНЬ.getСезон());
                                System.out.println(Місяці.КВІТЕНЬ);
                                System.out.println(Місяці.КВІТЕНЬ.getСезон());
                                System.out.println(Місяці.ТРАВЕНЬ);
                                System.out.println(Місяці.ТРАВЕНЬ.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println("Day in month-------------------------");
                            if(Місяці.СІЧЕНЬ.getДні() == 31 || Місяці.БEPEЗЕНЬ.getДні() == 31 ||Місяці.ТРАВЕНЬ.getДні() == 31 || Місяці.ЛИПЕНЬ.getДні() == 31 || Місяці.СЕРПЕНЬ.getДні() == 31 || Місяці.ГРУДЕНЬ.getДні() == 31 ||Місяці.ЖОВТЕНЬ.getДні() == 31  ) {
                                System.out.println(Місяці.СІЧЕНЬ);
                                System.out.println(Місяці.СІЧЕНЬ.getДні());
                                System.out.println(Місяці.БEPEЗЕНЬ);
                                System.out.println(Місяці.БEPEЗЕНЬ.getДні());
                                System.out.println(Місяці.ТРАВЕНЬ);
                                System.out.println(Місяці.ТРАВЕНЬ.getДні());
                                System.out.println(Місяці.ЛИПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ.getДні());
                                System.out.println(Місяці.ЖОВТЕНЬ);
                                System.out.println(Місяці.ЖОВТЕНЬ.getДні());
                                System.out.println(Місяці.ГРУДЕНЬ);
                                System.out.println(Місяці.ГРУДЕНЬ.getДні());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ВЕСНА.getEngVersion());
                            break;
                        case "6":
                            System.out.println(choice.equalsIgnoreCase("ЧЕРВЕНЬ"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ЛІТО.equals(Місяці.ЧЕРВЕНЬ.getСезон()) || Сезони.ЛІТО.equals(Місяці.ЛИПЕНЬ.getСезон())|| Сезони.ЛІТО.equals(Місяці.СЕРПЕНЬ.getСезон()) ) {
                                System.out.println(Місяці.ЧЕРВЕНЬ);
                                System.out.println(Місяці.ЧЕРВЕНЬ.getСезон());
                                System.out.println(Місяці.ЛИПЕНЬ);
                                System.out.println(Місяці.ЛИПЕНЬ.getСезон());
                                System.out.println(Місяці.СЕРПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println("Day in month-------------------------");
                            if(Місяці.КВІТЕНЬ.getДні() == 30 || Місяці.ЧЕРВЕНЬ.getДні() == 30 ||Місяці.ВЕРЕСЕНЬ.getДні() == 30 || Місяці.ЛИСТОПАД.getДні() == 30 ) {
                                System.out.println(Місяці.КВІТЕНЬ);
                                System.out.println(Місяці.КВІТЕНЬ.getДні());
                                System.out.println(Місяці.ЧЕРВЕНЬ);
                                System.out.println(Місяці.ЧЕРВЕНЬ.getДні());
                                System.out.println(Місяці.ВЕРЕСЕНЬ);
                                System.out.println(Місяці.ВЕРЕСЕНЬ.getДні());
                                System.out.println(Місяці.ЛИСТОПАД);
                                System.out.println(Місяці.ЛИСТОПАД.getДні());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ЛІТО.getEngVersion());
                            break;
                        case "7":
                            System.out.println(choice.equalsIgnoreCase("ЛИПЕНЬ"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ЛІТО.equals(Місяці.ЧЕРВЕНЬ.getСезон()) || Сезони.ЛІТО.equals(Місяці.ЛИПЕНЬ.getСезон())|| Сезони.ЛІТО.equals(Місяці.СЕРПЕНЬ.getСезон()) ) {
                                System.out.println(Місяці.ЧЕРВЕНЬ);
                                System.out.println(Місяці.ЧЕРВЕНЬ.getСезон());
                                System.out.println(Місяці.ЛИПЕНЬ);
                                System.out.println(Місяці.ЛИПЕНЬ.getСезон());
                                System.out.println(Місяці.СЕРПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println("Day in month-------------------------");
                            if(Місяці.СІЧЕНЬ.getДні() == 31 || Місяці.БEPEЗЕНЬ.getДні() == 31 ||Місяці.ТРАВЕНЬ.getДні() == 31 || Місяці.ЛИПЕНЬ.getДні() == 31 || Місяці.СЕРПЕНЬ.getДні() == 31 || Місяці.ГРУДЕНЬ.getДні() == 31 ||Місяці.ЖОВТЕНЬ.getДні() == 31  ) {
                                System.out.println(Місяці.СІЧЕНЬ);
                                System.out.println(Місяці.СІЧЕНЬ.getДні());
                                System.out.println(Місяці.БEPEЗЕНЬ);
                                System.out.println(Місяці.БEPEЗЕНЬ.getДні());
                                System.out.println(Місяці.ТРАВЕНЬ);
                                System.out.println(Місяці.ТРАВЕНЬ.getДні());
                                System.out.println(Місяці.ЛИПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ.getДні());
                                System.out.println(Місяці.ЖОВТЕНЬ);
                                System.out.println(Місяці.ЖОВТЕНЬ.getДні());
                                System.out.println(Місяці.ГРУДЕНЬ);
                                System.out.println(Місяці.ГРУДЕНЬ.getДні());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ЛІТО.getEngVersion());
                            break;
                        case "8":
                            System.out.println(choice.equalsIgnoreCase("Серпень"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ЛІТО.equals(Місяці.ЧЕРВЕНЬ.getСезон()) || Сезони.ЛІТО.equals(Місяці.ЛИПЕНЬ.getСезон())|| Сезони.ЛІТО.equals(Місяці.СЕРПЕНЬ.getСезон()) ) {
                                System.out.println(Місяці.ЧЕРВЕНЬ);
                                System.out.println(Місяці.ЧЕРВЕНЬ.getСезон());
                                System.out.println(Місяці.ЛИПЕНЬ);
                                System.out.println(Місяці.ЛИПЕНЬ.getСезон());
                                System.out.println(Місяці.СЕРПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println("Day in month-------------------------");
                            if(Місяці.СІЧЕНЬ.getДні() == 31 || Місяці.БEPEЗЕНЬ.getДні() == 31 ||Місяці.ТРАВЕНЬ.getДні() == 31 || Місяці.ЛИПЕНЬ.getДні() == 31 || Місяці.СЕРПЕНЬ.getДні() == 31 || Місяці.ГРУДЕНЬ.getДні() == 31 ||Місяці.ЖОВТЕНЬ.getДні() == 31  ) {
                                System.out.println(Місяці.СІЧЕНЬ);
                                System.out.println(Місяці.СІЧЕНЬ.getДні());
                                System.out.println(Місяці.БEPEЗЕНЬ);
                                System.out.println(Місяці.БEPEЗЕНЬ.getДні());
                                System.out.println(Місяці.ТРАВЕНЬ);
                                System.out.println(Місяці.ТРАВЕНЬ.getДні());
                                System.out.println(Місяці.ЛИПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ.getДні());
                                System.out.println(Місяці.ЖОВТЕНЬ);
                                System.out.println(Місяці.ЖОВТЕНЬ.getДні());
                                System.out.println(Місяці.ГРУДЕНЬ);
                                System.out.println(Місяці.ГРУДЕНЬ.getДні());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ЛІТО.getEngVersion());
                            break;
                        case "9":
                            System.out.println(choice.equalsIgnoreCase("Вересень"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ОСІНЬ.equals(Місяці.ВЕРЕСЕНЬ.getСезон()) || Сезони.ОСІНЬ.equals(Місяці.ЖОВТЕНЬ.getСезон())|| Сезони.ОСІНЬ.equals(Місяці.ЛИСТОПАД.getСезон()) ) {
                                System.out.println(Місяці.ВЕРЕСЕНЬ);
                                System.out.println(Місяці.ВЕРЕСЕНЬ.getСезон());
                                System.out.println(Місяці.ЖОВТЕНЬ);
                                System.out.println(Місяці.ЖОВТЕНЬ.getСезон());
                                System.out.println(Місяці.ЛИСТОПАД);
                                System.out.println(Місяці.ЛИСТОПАД.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println("Day in month-------------------------");
                            if(Місяці.КВІТЕНЬ.getДні() == 30 || Місяці.ЧЕРВЕНЬ.getДні() == 30 ||Місяці.ВЕРЕСЕНЬ.getДні() == 30 || Місяці.ЛИСТОПАД.getДні() == 30 ) {
                                System.out.println(Місяці.КВІТЕНЬ);
                                System.out.println(Місяці.КВІТЕНЬ.getДні());
                                System.out.println(Місяці.ЧЕРВЕНЬ);
                                System.out.println(Місяці.ЧЕРВЕНЬ.getДні());
                                System.out.println(Місяці.ВЕРЕСЕНЬ);
                                System.out.println(Місяці.ВЕРЕСЕНЬ.getДні());
                                System.out.println(Місяці.ЛИСТОПАД);
                                System.out.println(Місяці.ЛИСТОПАД.getДні());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ОСІНЬ.getEngVersion());
                            break;
                        case "10":
                            System.out.println(choice.equalsIgnoreCase("Жовтень"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ОСІНЬ.equals(Місяці.ВЕРЕСЕНЬ.getСезон()) || Сезони.ОСІНЬ.equals(Місяці.ЖОВТЕНЬ.getСезон())|| Сезони.ОСІНЬ.equals(Місяці.ЛИСТОПАД.getСезон()) ) {
                                System.out.println(Місяці.ВЕРЕСЕНЬ);
                                System.out.println(Місяці.ВЕРЕСЕНЬ.getСезон());
                                System.out.println(Місяці.ЖОВТЕНЬ);
                                System.out.println(Місяці.ЖОВТЕНЬ.getСезон());
                                System.out.println(Місяці.ЛИСТОПАД);
                                System.out.println(Місяці.ЛИСТОПАД.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println("Day in month-------------------------");
                            if(Місяці.СІЧЕНЬ.getДні() == 31 || Місяці.БEPEЗЕНЬ.getДні() == 31 ||Місяці.ТРАВЕНЬ.getДні() == 31 || Місяці.ЛИПЕНЬ.getДні() == 31 || Місяці.СЕРПЕНЬ.getДні() == 31 || Місяці.ГРУДЕНЬ.getДні() == 31 ||Місяці.ЖОВТЕНЬ.getДні() == 31  ) {
                                System.out.println(Місяці.СІЧЕНЬ);
                                System.out.println(Місяці.СІЧЕНЬ.getДні());
                                System.out.println(Місяці.БEPEЗЕНЬ);
                                System.out.println(Місяці.БEPEЗЕНЬ.getДні());
                                System.out.println(Місяці.ТРАВЕНЬ);
                                System.out.println(Місяці.ТРАВЕНЬ.getДні());
                                System.out.println(Місяці.ЛИПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ.getДні());
                                System.out.println(Місяці.ЖОВТЕНЬ);
                                System.out.println(Місяці.ЖОВТЕНЬ.getДні());
                                System.out.println(Місяці.ГРУДЕНЬ);
                                System.out.println(Місяці.ГРУДЕНЬ.getДні());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ОСІНЬ.getEngVersion());
                            break;
                        case "11":
                            System.out.println(choice.equalsIgnoreCase("Листопад"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ОСІНЬ.equals(Місяці.ВЕРЕСЕНЬ.getСезон()) || Сезони.ОСІНЬ.equals(Місяці.ЖОВТЕНЬ.getСезон())|| Сезони.ОСІНЬ.equals(Місяці.ЛИСТОПАД.getСезон()) ) {
                                System.out.println(Місяці.ВЕРЕСЕНЬ);
                                System.out.println(Місяці.ВЕРЕСЕНЬ.getСезон());
                                System.out.println(Місяці.ЖОВТЕНЬ);
                                System.out.println(Місяці.ЖОВТЕНЬ.getСезон());
                                System.out.println(Місяці.ЛИСТОПАД);
                                System.out.println(Місяці.ЛИСТОПАД.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println("Day in month-------------------------");
                            if(Місяці.КВІТЕНЬ.getДні() == 30 || Місяці.ЧЕРВЕНЬ.getДні() == 30 ||Місяці.ВЕРЕСЕНЬ.getДні() == 30 || Місяці.ЛИСТОПАД.getДні() == 30 ) {
                                System.out.println(Місяці.КВІТЕНЬ);
                                System.out.println(Місяці.КВІТЕНЬ.getДні());
                                System.out.println(Місяці.ЧЕРВЕНЬ);
                                System.out.println(Місяці.ЧЕРВЕНЬ.getДні());
                                System.out.println(Місяці.ВЕРЕСЕНЬ);
                                System.out.println(Місяці.ВЕРЕСЕНЬ.getДні());
                                System.out.println(Місяці.ЛИСТОПАД);
                                System.out.println(Місяці.ЛИСТОПАД.getДні());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ОСІНЬ.getEngVersion());
                            break;
                        case "12":
                            System.out.println(choice.equalsIgnoreCase("Грудень"));
                            System.out.println("Seasons------------------------");
                            if(Сезони.ЗИМА.equals(Місяці.ГРУДЕНЬ.getСезон()) || Сезони.ЗИМА.equals(Місяці.СІЧЕНЬ.getСезон())|| Сезони.ЗИМА.equals(Місяці.ЛЮТИЙ.getСезон()) ) {
                                System.out.println(Місяці.ГРУДЕНЬ );
                                System.out.println(Місяці.ГРУДЕНЬ.getСезон());
                                System.out.println(Місяці.СІЧЕНЬ);
                                System.out.println(Місяці.СІЧЕНЬ.getСезон());
                                System.out.println(Місяці.ЛЮТИЙ);
                                System.out.println(Місяці.ЛЮТИЙ.getСезон());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println("Day in month-------------------------");
                            if(Місяці.СІЧЕНЬ.getДні() == 31 || Місяці.БEPEЗЕНЬ.getДні() == 31 ||Місяці.ТРАВЕНЬ.getДні() == 31 || Місяці.ЛИПЕНЬ.getДні() == 31 || Місяці.СЕРПЕНЬ.getДні() == 31 || Місяці.ГРУДЕНЬ.getДні() == 31 ||Місяці.ЖОВТЕНЬ.getДні() == 31  ) {
                                System.out.println(Місяці.СІЧЕНЬ);
                                System.out.println(Місяці.СІЧЕНЬ.getДні());
                                System.out.println(Місяці.БEPEЗЕНЬ);
                                System.out.println(Місяці.БEPEЗЕНЬ.getДні());
                                System.out.println(Місяці.ТРАВЕНЬ);
                                System.out.println(Місяці.ТРАВЕНЬ.getДні());
                                System.out.println(Місяці.ЛИПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ);
                                System.out.println(Місяці.СЕРПЕНЬ.getДні());
                                System.out.println(Місяці.ЖОВТЕНЬ);
                                System.out.println(Місяці.ЖОВТЕНЬ.getДні());
                                System.out.println(Місяці.ГРУДЕНЬ);
                                System.out.println(Місяці.ГРУДЕНЬ.getДні());
                            }else {
                                System.out.println(false);
                            }
                            System.out.println(" Season in english version-----------------------");
                            System.out.println(Сезони.ЗИМА.getEngVersion());
                            break;
                    }
                    
                case "C":
                    System.out.println("Choose days  ");
                    String c = scanner.nextLine();
                    switch (c) {
                        case "31":
                            if(Місяці.СІЧЕНЬ.getДні() == 31 || Місяці.БEPEЗЕНЬ.getДні() == 31 ||Місяці.ТРАВЕНЬ.getДні() == 31 || Місяці.ЛИПЕНЬ.getДні() == 31 || Місяці.СЕРПЕНЬ.getДні() == 31 || Місяці.ГРУДЕНЬ.getДні() == 31 ||Місяці.ЖОВТЕНЬ.getДні() == 31  ) {
                            System.out.println(Місяці.СІЧЕНЬ);
                            System.out.println(Місяці.БEPEЗЕНЬ);
                            System.out.println(Місяці.ТРАВЕНЬ);
                            System.out.println(Місяці.ЛИПЕНЬ);
                            System.out.println(Місяці.СЕРПЕНЬ);
                            System.out.println(Місяці.ГРУДЕНЬ);
                                System.out.println(Місяці.ЖОВТЕНЬ);
                            }else {
                                System.out.println(false);
                            }
                            break;
                        case "28":
                            if(Місяці.ЛЮТИЙ.getДні() == 28 ) {
                            System.out.println(Місяці.ЛЮТИЙ);
                            break;
                            }else {
                                System.out.println(false);
                            }
                        case "30":
                            if(Місяці.КВІТЕНЬ.getДні() == 30 || Місяці.ЧЕРВЕНЬ.getДні() == 30 ||Місяці.ВЕРЕСЕНЬ.getДні() == 30 || Місяці.ЛИСТОПАД.getДні() == 30 ) {
                                System.out.println(Місяці.КВІТЕНЬ);
                            System.out.println(Місяці.ЧЕРВЕНЬ);
                            System.out.println(Місяці.ВЕРЕСЕНЬ);
                            System.out.println(Місяці.ЛИСТОПАД);
                            }else {
                                System.out.println(false);
                            }
                            break;
                    }
                case "E":
                    System.out.println("Choose English season  ");
                    String e = scanner.nextLine();
                    switch (e) {
                        case "1":
                            System.out.println(Сезони.ЗИМА.getEngVersion());
                            break;
                        case "2":
                            System.out.println(Сезони.ВЕСНА.getEngVersion());
                            break;
                        case "3":
                            System.out.println(Сезони.ЛІТО.getEngVersion());
                            break;
                        case "4":
                            System.out.println(Сезони.ОСІНЬ.getEngVersion());
                            break;
                    }
                case "0":
                    System.exit(0);

            }
        }
    }
}
