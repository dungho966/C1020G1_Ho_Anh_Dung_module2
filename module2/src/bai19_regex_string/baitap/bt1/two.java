//
//public class MainController {
//    ManagerService managerService = new ManagerService();
//    ManagerCustomers managerCustomers = new ManagerCustomers();
//    ManagerEmployee managerEmployee = new ManagerEmployee();
//
//    public void displayMainMenu() {
//        int choose;
//        do {
//            System.out.println("1.Add New Services");
//            System.out.println("2.Show Services");
//            System.out.println("3.Add New Customer");
//            System.out.println("4.Show Information of Customer");
//            System.out.println("5.Add New Booking");
//            System.out.println("6.Add New Employee");
//            System.out.println("7.Show Information of Employee");
//            System.out.println("8.Exit");
//            System.out.println("================================");
//            System.out.println("Enter Your Choose : ");
//            choose = RegularExpression.inputInt();
//            switch (choose) {
//                case 1:
//                    addNewServices();
//                    break;
//                case 2:
//                    showServices();
//                    break;
//                case 3:
//                    addNewCustomers();
//                    break;
//                case 4:
//                    showCustomer();
//                    break;
//                case 5:
//                    addNewBooking();
//                    break;
//                case 6:
//                    addNewEmployees();
//                    break;
//                case 7:
//                    showEmployee();
//                    break;
//                case 8:
//                    System.out.println(Constant.SEE_YOU_LATER);
//                    break;
//                default:
//                    System.err.println(Constant.CHOOSE_ERROR);
//            }
//        } while (choose != 7);
//    }
//
//    private void addNewBooking() {
//        int index;
//        int choose;
//        do {
//            managerCustomers.showCustomersName();
//            System.out.println("Enter Index Customer to Booking : ");
//            index = RegularExpression.inputInt() - 1;
//        } while (index < 0 || index >= managerCustomers.getCustomerList().size());
//        do {
//            System.out.println("1.Booking a Villa");
//            System.out.println("2.Booking a House");
//            System.out.println("3.Booking a Room");
//            System.out.println("4.Back to Menu");
//            System.out.println("5.Exit Program");
//            System.out.println("Enter Your Choose : ");
//            choose = RegularExpression.inputInt();
//            switch (choose) {
//                case 1:
//                    managerService.showVillaName();
//                    if (!(managerService.getVillaList().size() == 0)){
//                        System.out.println("Enter Index Villa : ");
//                        int indexVilla = RegularExpression.inputInt();
//                        managerCustomers.bookingVilla(index, indexVilla);
//                        break;
//                    }
//                case 2:
//                    managerService.showHouseName();
//                    if (!(managerService.getHouseList().size() == 0)){
//                        System.out.println("Enter Index House : ");
//                        int indexHouse = RegularExpression.inputInt();
//                        managerCustomers.bookingHouse(index, indexHouse);
//                    }
//                    break;
//                case 3:
//                    managerService.showRoomName();
//                    if (!(managerService.getRoomList().size() == 0)){
//                        System.out.println("Enter Index Room : ");
//                        int indexRoom = RegularExpression.inputInt();
//                        managerCustomers.bookingRoom(index, indexRoom);
//                        break;
//                    }
//                case 4:
//                    System.out.println();
//                    break;
//                case 5:
//                    System.exit(0);
//            }
//            managerCustomers.showBooking();
//        } while (choose != 4);
//    }
//
//    private void showEmployee() {
//        int index;
//        do {
//            managerEmployee.showEmployeeName();
//            index = getIndex();
//            if (index == -1) {
//                break;
//            }
//            int choose;
//            do {
//                managerEmployee.showInformationEmployee(index);
//                System.out.println("0.Back to Menu");
//                choose = RegularExpression.inputInt();
//            } while (choose != 0);
//        } while (true);
//    }
//
//    private void addNewEmployees() {
//        managerEmployee.addEmployee();
//    }
//
//    private void showCustomer() {
//        int index;
//        do {
//            managerCustomers.showCustomersName();
//            index = getIndex();
//            if (index == -1) {
//                break;
//            }
//            System.out.println("Enter 1 If You Want to Edit!");
//            int choice = RegularExpression.inputInt();
//            if (choice == 1) {
//                managerCustomers.editCustomer(index);
//            } else {
//                int choose;
//                do {
//                    managerCustomers.showInformationCustomer(index);
//                    System.out.println("0.Back to Menu");
//                    choose = RegularExpression.inputInt();
//                } while (choose != 0);
//            }
//        } while (true);
//    }
//
//    private void addNewCustomers() {
//        managerCustomers.addCustomer();
//    }
//
//    private void showServices() {
//        int choose;
//        do {
//            System.out.println("1.Show all Villa");
//            System.out.println("2.Show all House");
//            System.out.println("3.Show all Room");
//            System.out.println("4.Show All Name Villa Not Duplicate");
//            System.out.println("5.Show All Name House Not Duplicate");
//            System.out.println("6.Show All Name Room Not Duplicate");
//            System.out.println("7.Back to Menu");
//            System.out.println("8.Exit");
//            System.out.println("================");
//            System.out.println("Enter Your Choose : ");
//            choose = RegularExpression.inputInt();
//            switch (choose) {
//                case 1:
//                    showVilla();
//                    break;
//                case 2:
//                    showHouse();
//                    break;
//                case 3:
//                    showRoom();
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    break;
//                case 6:
//                    break;
//                case 7:
//                    System.out.println();
//                    break;
//                case 8:
//                    System.out.println(Constant.SEE_YOU_LATER);
//                    System.exit(0);
//            }
//            System.out.println();
//        } while (choose != 7);
//    }
//
//    private void showRoom() {
//        int index;
//        do {
//            if (managerService.getRoomList().size() == 0) {
//                System.out.println(Constant.NOTHING_TO_SHOW);
//                break;
//            }
//            managerService.showRoomName();
//            index = getIndex();
//            if (index == -1) {
//                break;
//            }
//            int choice = RegularExpression.inputInt();
//            if (choice == 1) {
//                managerService.editHouse(index);
//            } else {
//                int choose;
//                do {
//                    managerService.showInformationRoom(index);
//                    System.out.println("0.Back to Menu");
//                    choose = RegularExpression.inputInt();
//                } while (choose != 0);
//            }
//        } while (true);
//    }
//
//    private void showHouse() {
//        int index;
//        do {
//            if (managerService.getHouseList().size() == 0) {
//                System.out.println(Constant.NOTHING_TO_SHOW);
//                break;
//            }
//            managerService.showHouseName();
//            index = getIndex();
//            if (index == -1) {
//                break;
//            }
//            System.out.println("Enter 1 to Edit");
//            int choice = RegularExpression.inputInt();
//            if (choice == 1) {
//                managerService.editHouse(index);
//            } else {
//                int choose;
//                do {
//                    managerService.showInformationHouse(index);
//                    System.out.println("0.Back to Menu");
//                    choose = RegularExpression.inputInt();
//                } while (choose != 0);
//            }
//        } while (true);
//    }
//
//    private void showVilla() {
//        int index;
//        do {
//            if (managerService.getVillaList().size() == 0) {
//                System.out.println(Constant.NOTHING_TO_SHOW);
//                break;
//            }
//            managerService.showVillaName();
//            index = getIndex();
//            if (index == -1) {
//                break;
//            }
//            System.out.println("Enter 1 to Edit");
//            int choice = RegularExpression.inputInt();
//            if (choice == 1) {
//                managerService.editVilla(index);
//            } else {
//                int choose;
//                do {
//                    managerService.showInformationVilla(index);
//                    System.out.println("0.Back to Menu");
//                    choose = RegularExpression.inputInt();
//                } while (choose != 0);
//            }
//        } while (true);
//    }
//
//    private int getIndex() {
//        int index;
//        System.out.println("0.Back to Menu");
//        System.out.println("Enter Index to See Detail : ");
//        index = RegularExpression.inputInt() - 1;
//        return index;
//    }
//
//    private void addNewServices() {
//        int choose;
//        do {
//            System.out.println("1.Add New Villa");
//            System.out.println("2.Add New House");
//            System.out.println("3.Add New Room");
//            System.out.println("4.Back to Menu");
//            System.out.println("5.Exit");
//            System.out.println("================");
//            System.out.println("Enter Your Choose : ");
//            choose = RegularExpression.inputInt();
//            switch (choose) {
//                case 1:
//                    managerService.addNewVilla();
//                    break;
//                case 2:
//                    managerService.addNewHouse();
//                    break;
//                case 3:
//                    managerService.addNewRoom();
//                    break;
//                case 4:
//                    System.out.println();
//                    break;
//                case 5:
//                    System.out.println(Constant.SEE_YOU_LATER);
//                    System.exit(0);
//                default:
//                    System.err.println(Constant.CHOOSE_ERROR);
//            }
//        } while (choose != 4);
//    }
//
//    public static void main(String[] args) {
//        MainController mainController = new MainController();
//        mainControlle