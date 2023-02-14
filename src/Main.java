import check.TransportTypeException;
import drivers.DbDrivers;
import transport.DbTransport;
import transport.Mechanic;
import transport.Sto;
import transport.Transport;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws TransportTypeException {

        DbTransport transport = new DbTransport();
        DbDrivers drivers = new DbDrivers();
        Sto stoDepartment = new Sto();

        // Создание Мар: ключ - бренд авто; значение - механик обслуживающий данный авто. Вывод в консоль.

        Map<Transport, Mechanic> listAvtoMech = new HashMap<>();
        listAvtoMech.put(transport.participants.get(0), transport.participants.get(0).getMechanic());
        listAvtoMech.put(transport.participants.get(8), transport.participants.get(8).getMechanic());
        listAvtoMech.put(transport.participants.get(5), transport.participants.get(5).getMechanic());
        listAvtoMech.put(transport.participants.get(11), transport.participants.get(11).getMechanic());

        for (Map.Entry<Transport, Mechanic> listPrintMap : listAvtoMech.entrySet()){
            System.out.println(listPrintMap.getKey().getBrand() + " " + listPrintMap.getValue());
        }
    }
}