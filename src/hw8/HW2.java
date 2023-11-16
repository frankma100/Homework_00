package hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Train {
    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;

    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", start='" + start + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                '}';
    }
}

public class HW2 {  //TrainTest
    public static void main(String[] args) {
        // 使用List存儲Train物件
        List<Train> trains = new ArrayList<>();

        // 透過建構子產生Train物件
        trains.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trains.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trains.add(new Train(118, "自強", "高雄", "台北", 500));
        trains.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trains.add(new Train(122, "自強", "台中", "花蓮", 600));
        trains.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trains.add(new Train(1254, "區間", "屏東", "基隆", 700));

        // 1. 印出不重複的Train物件
        System.out.println("印出不重複的Train物件:");
        Set<Train> uniqueTrains = new HashSet<>(trains);
        for (Train train : uniqueTrains) {
            System.out.println(train);
        }

        // 2. 以班次編號由大到小印出Train物件
        System.out.println("\n以班次編號由大到小印出Train物件:");
        TreeSet<Train> sortedTrains = new TreeSet<>((train1, train2) -> Integer.compare(train2.getNumber(), train1.getNumber()));
        sortedTrains.addAll(trains);
        for (Train train : sortedTrains) {
            System.out.println(train);
        }

        // 3. 不重複印出Train物件且班次編號由大到小
        System.out.println("\n不重複印出Train物件且班次編號由大到小:");
        Set<Train> uniqueSortedTrains = new TreeSet<>((train1, train2) -> Integer.compare(train2.getNumber(), train1.getNumber()));
        uniqueSortedTrains.addAll(trains);
        for (Train train : uniqueSortedTrains) {
            System.out.println(train);
        }
    }
}