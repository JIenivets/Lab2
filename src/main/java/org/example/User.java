package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String login;
    private String password;
    private List<Train> trainsData;

    public User(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
        this.trainsData = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addTrain(String name, Integer carriageCout, String tripName){
        trainsData.add(new Train(name, carriageCout, tripName));
        System.out.println("Поезд {"+name+", "+carriageCout+", №"+tripName+"} добавлен!");
    }

    public void removeTrain(Integer index){
        System.out.println("Поезд {"+trainsData.get(index).name+", "+trainsData.get(index).carriageCout+", №"+trainsData.get(index).tripName+"} удален!");
        trainsData.remove(index);
    }

    public void EditTrain(Integer index, String newName, Integer newCarriageCout, String newTripName){
        Train train = trainsData.get(index);

        String oldTrain = train.name+", "+train.carriageCout+", №"+train.tripName;
        String newTrain = newName+", "+newCarriageCout+", №"+newTripName;

        train.changeName(newName);
        train.changeCarriageCout(newCarriageCout);
        train.changeTripNaem(newTripName);

        System.out.println("Поезд {"+oldTrain+"}\n изменен на\n{"+newTrain+'}');
    }

    public void printTrainsData(){
        if(!(trainsData == null || trainsData.isEmpty())) {
            for (int item = 0; item < trainsData.size(); item++) {
                System.out.println(item + " : " + trainsData.get(item).toString());
            }
        } else {
            System.out.println(" [ ]\nСписок поездов пуст!");
        }

    }

    @Override
    public String toString() {
        return "{\n" +
                "\tname: \"" + name + "\",\n" +
                "\tlogin: \"" + login + "\",\n" +
                "\tpassword: \"" + password + "\"\n" +
                '}';
    }
}
