/*package pl.pjatk.barkry;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/test")
public class JAZRestController {

    @Autowired
    private CarService carService;

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> Car1(){
        Car audi = new Car("Audi");
        return ResponseEntity.ok(audi);
    }

    @GetMapping("/hello/{somevalue}")
    public ResponseEntity<String> handle(@PathVariable String somevalue) {
        return ResponseEntity.ok(somevalue);
    }

    @GetMapping("/hello/test")
    public ResponseEntity<String> Requester(@RequestParam String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @PostMapping ("/model")
    public ResponseEntity<Car> createCar(@RequestBody Car car1){
        return ResponseEntity.ok(car1);
    }

    @GetMapping("/homework/{homeworkvalue}")
    public ResponseEntity<String> homeworkPath(@PathVariable String homeworkvalue) {
        return ResponseEntity.ok(homeworkvalue);
    }

    @GetMapping("/homework/")
    public ResponseEntity<String> homeworkReq(@RequestParam String homeworkvalue2) {
        return ResponseEntity.ok(homeworkvalue2);
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/{carID}")
    public Car getCar(@PathVariable("carID") int carId) {
        return carService.getCar(carId);
    }

    @PostMapping("/addCar")
    public Car addCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    @PutMapping("/updateCar/{carId}")
    public Car updateCar(@PathVariable(value = "carId") int carId,
                                         @RequestBody Car car){
        return carService.updateCar(carId, car);
    }

    @DeleteMapping("/deleteCar/{carId}")
    public void deleteCar(@PathVariable(value = "carId") int carId){
        carService.deleteCar(carId);
    }
}
*/