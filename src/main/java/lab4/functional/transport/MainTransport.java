package lab4.functional.transport;

import com.fasterxml.jackson.databind.ObjectMapper;
import lab4.functional.transport.model.TransportDataBase;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class MainTransport {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            TransportDataBase dataBase =
                    mapper.readValue(new File("C:\\Users\\Atlas\\IdeaProjects\\lab2\\src\\main\\java\\lab4\\functional\\transport\\transport.json"), TransportDataBase.class);

            if (dataBase != null) {
                //1

                dataBase.getData().getVehicles().stream().map(v -> v.getProperties().getVehicleMetaData().getTransport().getType()).collect(Collectors.toSet()).forEach(System.out::println);

                //2

                String nameVehicle = "bus";
                String name = "55";
                long count = dataBase.getData().getVehicles().stream().filter(v -> v.getProperties().getVehicleMetaData().getTransport().getType().equals(nameVehicle) &&
                        v.getProperties().getVehicleMetaData().getTransport().getName().equals(name)).count();
                System.out.println(count);

                //3

                Map<String, Integer> map = dataBase.getData().getVehicles().stream()
                        .collect(Collectors.toMap(v -> v.getProperties().getVehicleMetaData().getTransport().getId(), v -> v.getFeatures().stream().mapToInt(e -> e.getGeometry().getCoordinates().size()).sum()));

                for (String str : map.keySet()) {
                    System.out.println(str + " " + map.get(str));
                }

                //4
                List<List<String>> map2 = dataBase.getData().getVehicles().stream()
                        .map(v -> List.of(
                                v.getProperties().getVehicleMetaData().getTransport().getName(),
                                v.getProperties().getVehicleMetaData().getTransport().getType(),
                                v.getProperties().getVehicleMetaData().getTransport().getId()))
                        .toList()
                        .stream()
                        .sorted(Comparator.comparing(e->e.get(0)))
                        .toList();

                for (List<String> list : map2) {
                    System.out.println(list);
                }

                //5

                long [] A = dataBase.getData().getVehicles().stream()
                        .flatMapToLong(v -> v.getFeatures().stream()
                                .mapToLong(e->e.getProperties().getTrajectorySegmentMetaData().getTime())).toArray();

                for (Long num : A) {
                    System.out.println(Date.from(Instant.ofEpochSecond(num)));
                }


                //6

                String typeI = "trolleybus";
                dataBase.getData().getVehicles().stream().filter(v -> v.getProperties().getVehicleMetaData().getTransport().getType().equals(typeI)).map(vehicle -> vehicle.getProperties().getVehicleMetaData().getTransport().getId()).forEach(System.out::println);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /*public static void allTransportNamesSorted(TransportDataBase dataBase) {
        List<String> list = dataBase.getData().getVehicles().stream()
                .map(v -> v.getProperties().getVehicleMetaData().getTransport().getName())
                .sorted((o1, o2) -> {
                    if (o1.equals(o2)) return 0;
                    if (o1.equals("ЖК Атмосфера")) return 1;
                    if (o2.equals("ЖК Атмосфера")) return -1;
                    return Integer.compare(
                            o1.charAt(o1.length() - 1) <= '9' && o1.charAt(o1.length() - 1) >= '0' ?
                                    Integer.parseInt(o1) : Integer.parseInt(o1.substring(0, o1.length() - 1)),
                            o2.charAt(o2.length() - 1) <= '9' && o2.charAt(o2.length() - 1) >= '0' ?
                                    Integer.parseInt(o2) : Integer.parseInt(o2.substring(0, o2.length() - 1)));
                })
                .toList();

        System.out.println(list);
    }*/

}
