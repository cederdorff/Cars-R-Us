package ita3.car.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import ita3.car.entity.Car;
import ita3.car.repository.ICarRepository;

@Controller
public class DeveloperData implements ApplicationRunner {

    // Denne klasse er jeres legeplads. Vi bruger den til at lave de første øvelser
    // og til at teste ting af inden vi putter dem over i et "rigtigt projekt"

    ICarRepository carRepository;

    public DeveloperData(ICarRepository carRepository){
        this.carRepository=carRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("I was Called!");

        carRepository.save(new Car("Polestar", "Polestar 2", 795.97, 100));
        carRepository.save(new Car("Tesla", "Model 3", 549.99, 98));
        carRepository.save(new Car("Audi", "e-tron", 799.95, 95));
        carRepository.save(new Car("BMW", "i4", 699.88, 92));
        carRepository.save(new Car("Ford", "Mustang Mach-E", 649.75, 89));
        carRepository.save(new Car("Nissan", "Leaf", 349.49, 78));
        carRepository.save(new Car("Chevrolet", "Bolt EV", 399.60, 80));
        carRepository.save(new Car("Hyundai", "Kona Electric", 449.69, 82));
        carRepository.save(new Car("Kia", "Niro EV", 359.55, 76));
        carRepository.save(new Car("Volkswagen", "ID.4", 529.82, 94));    
    }
}
