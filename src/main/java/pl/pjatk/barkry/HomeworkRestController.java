package pl.pjatk.barkry;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkRestController {

    @GetMapping("/{value}")
    public ResponseEntity<String> homework1(@PathVariable String value){
        return ResponseEntity.ok(value);
    }

    @GetMapping
    public ResponseEntity<String> homework2(@RequestParam String value){
        return ResponseEntity.ok(value);
    }

    @PostMapping("/post")
    public ResponseEntity<Car> post(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }

    @PutMapping("/{carId}")
    public ResponseEntity<Car> put(@PathVariable(value = "carId") int carId,
                         @RequestBody Car car){
        return ResponseEntity.ok(car);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    void delete(){
    }
}
