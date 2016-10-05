package crud;

import entity.Car;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by insomniac on 10/5/16.
 */
@ManagedBean(name = "carService")
@ApplicationScoped
public class CarService {

    List<Car> list;

    public CarService() {
        list = new ArrayList<Car>();

        list.add(new Car(1, "Alfa Romeo", "159", "fkjhjs"));
        list.add(new Car(2, "Alfa Romeo", "4C", "fkjhjs"));
    }

    public List<Car> selectAll(){
        return list;
    }

    public void create(int id, String man, String model, String license){
        list.add(new Car(id, man, model, license));
    }
}
