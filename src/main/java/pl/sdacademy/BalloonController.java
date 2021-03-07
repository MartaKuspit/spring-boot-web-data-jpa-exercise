package pl.sdacademy;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/balloon")
public class BalloonController {
    private BallonRepository ballonRepository;

    public BalloonController(BallonRepository ballonRepository) {
        this.ballonRepository = ballonRepository;
    }

    @GetMapping
    public List<Balloon> getAll(){
        return ballonRepository.findAll();
    }
    @PostMapping
    public Balloon create(@RequestBody Balloon balloon) {
        return ballonRepository.save(balloon);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        ballonRepository.deleteById(id);
    }

}
